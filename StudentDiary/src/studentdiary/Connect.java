/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdiary;

import java.net.*; 
import java.util.*;
import javax.swing.JOptionPane;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.json.*;
import javax.swing.*;

/**
 *
 * @author lalitmunne
 */
public class Connect {
    private String url = "http://118.185.122.67/yccerest/api/v2/";
	private Socket sc;
	private JSONObject obj; 
        private String output = "";
        private Document login;
        private String[] unique;
        private JSONArray internal;
        private JSONArray result;
        private String token; 
        private String uatype; 
        private String uano;
        private int id;
        public Connect(int username, int password) { 
            try { 
               login = Jsoup.connect(url + "initial/auth").ignoreContentType(true).data("username", username+"", "password", password+"").post();
            } catch (HttpStatusException e) {
                Dialog d = new Dialog();
                if (e.getStatusCode() == 401) {
                    d.showDialog("Invalid Username or Password");
                } else {
                    d.showDialog("Server Error....\nPlease Try Again");
                }
            } catch (Exception ex) { 
                ex.printStackTrace();
            }   
        }
        
        private class Dialog extends JFrame {
             public void showDialog(String msg) {
                JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.INFORMATION_MESSAGE);
             }
        }
    
	public String connect(int id) { 
		try { 
                        this.id = id;
			String body =  login.select("body").text();
                       
			obj = new JSONObject(body);
			token =  obj.getJSONObject("UserInfo").getString("Token");
			uatype =  obj.getJSONObject("UserInfo").getString("UaType");
			uano =  obj.getJSONObject("UserInfo").getString("UaNo");
			Document info = Jsoup.connect(url + "information/stud").ignoreContentType(true).header("token", token).header("id", uano).header("uatype", uatype).data("id", id+"").post();
			body = info.select("body").text();
			getInfo(new JSONObject(body), obj);
                        
                   
		} catch (Exception e) { 
			e.printStackTrace();
		}
                return output;
	}

	public void getInfo(JSONObject obj, JSONObject obj2) { 
		JSONArray stud_info = obj.getJSONArray("StudentInfo");
		JSONArray contact_info = obj.getJSONArray("ContactInfo");
		JSONArray postal_info = obj.getJSONArray("PostalInfo");
                internal = obj2.getJSONArray("InternalSession");
                result = obj2.getJSONArray("ExternalSession");
		printArray(stud_info);
		printArray(contact_info);
		printArray(postal_info);
	}

	public void printArray(JSONArray arr) { 
		for ( int i=0; i<arr.length(); i++ ) { 
                        output += arr.getJSONObject(i).getString("Key");
			output += ": " + arr.getJSONObject(i).getString("Value") + "\n";
		}
	}
        public void getSession(JSONArray arr){
            String[] sessions = new String[arr.length()];
            for ( int i=0; i<arr.length(); i++ ) {
                        sessions[i] = arr.getJSONObject(i).getString("SessionName");
                }
            unique = Arrays.stream(sessions).distinct().toArray(String[]::new);    
        }
        
        public JSONArray getType(String type){
            if (type.equals("internal"))
                return internal;
            if (type.equals("result"))
                return result;
            return new JSONArray();
        }
        public String[] getSem(String type, String sess) { 
            
            JSONArray arr = getType(type); 
            ArrayList<String> sems = new ArrayList<>();
            for ( int i=0; i<arr.length(); i++ ) {
                        if (sess.equals((String)arr.getJSONObject(i).getString("SessionName")))
                                sems.add(arr.getJSONObject(i).getString("SemesterName"));
                }
            return sems.stream().toArray(String[]::new);
            
        }
        public String getSemNoSessNo(String type, String session, String semester){
            String no = "";
            String sem = "";
            JSONArray arr = getType(type);
      
            for ( int i=0; i<arr.length(); i++ ) {
                        if (session.equals((String)arr.getJSONObject(i).getString("SessionName")))
                                if (semester.equals((String)arr.getJSONObject(i).getString("SemesterName"))) {
                                    no = (String)arr.getJSONObject(i).getString("SessionNo");
                                    sem = (String)arr.getJSONObject(i).getString("SemesterNo");
                                    break;
                                }
                                    
                }
            if (type.equals("internal"))
                return getInternalMarksString(no, sem);
            if (type.equals("result"))
                return getResult(no,sem);
            return "";
            
        }
        
        public String getResult(String no, String sem)
        {
            String body = "";
            String output = "=============== Result ===============\n\n\n";
            try {
                Document info = Jsoup.connect(url + "exam/ext").ignoreContentType(true).header("token", token).header("id", uano).header("uatype", uatype).data("id", id+"", "no", no, "sem", sem).post();
                body = info.select("body").text();
                JSONArray arr = new JSONObject(body).getJSONArray("Result");
                for(int i=0; i<2; i++)
                    output += (String)arr.getJSONObject(i).getString("Key") + ": \t\t" + (String)arr.getJSONObject(i).getString("Value") + "\n";
                output += (String)arr.getJSONObject(2).getString("Key") + ": \t" + (String)arr.getJSONObject(2).getString("Value") + "\n";
                output += (String)arr.getJSONObject(3).getString("Key") + ": \t" + (String)arr.getJSONObject(3).getString("Value") + "\n";
                output += (String)arr.getJSONObject(4).getString("Key") + ": \t\t" + (String)arr.getJSONObject(4).getString("Value") + "\n";
                output += "===================================\n\n";
                arr = new JSONObject(body).getJSONArray("ExternalMarks");
                for(int i=0; i<arr.length(); i++){
                    output += "CourseCode: \t\t" + (String)arr.getJSONObject(i).getString("CourseCode") + "\n";
                    output += "CourseName: \t" + (String)arr.getJSONObject(i).getString("CourseName") + "\n";
                    output += "Grade: \t\t" + (String)arr.getJSONObject(i).getString("Grade") + "\n";
                    output += "Credits: \t\t" + (String)arr.getJSONObject(i).getString("Credits") + "\n";
                    
                    output += "===================================\n\n\n";
                }
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            return output;
        }
        public String getInternalMarksString(String no, String sem ){
            String body = "";
            String output = "=============== Internal Marks ===============\n\n\n";
            try {
                Document info = Jsoup.connect(url + "exam/int").ignoreContentType(true).header("token", token).header("id", uano).header("uatype", uatype).data("id", id+"", "no", no, "sem", sem).post();
                body = info.select("body").text();
                JSONArray arr = new JSONObject(body).getJSONArray("InternalMarks");
                for(int i=0; i<arr.length(); i++){
                    output += "CourseCode: \t\t" + (String)arr.getJSONObject(i).getString("CourseCode") + "\n";
                    output += "CourseName: \t" + (String)arr.getJSONObject(i).getString("CourseName") + "\n";
                    output += "TA: \t\t" + (String)arr.getJSONObject(i).getString("S1Obt") + " / " + (String)arr.getJSONObject(i).getString("S1Max") + "\n";
                    output += "MSE I: \t\t" + (String)arr.getJSONObject(i).getString("S2Obt") + " / "+ (String)arr.getJSONObject(i).getString("S2Max") + "\n";
                    output += "MSE II: \t\t" + (String)arr.getJSONObject(i).getString("S3Obt") + " / "+ (String)arr.getJSONObject(i).getString("S3Max") + "\n";
                    output += "====================================\n\n\n";
                }
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            return output;
	//getInfo(new JSONObject(body), obj);   
        }
        public String[] getUnique(String type){
            if (type.equals("internal"))
                getSession(internal);
            if (type.equals("result"))
                getSession(result);
             return unique; 
        }
        public String getAttendance() { 
            String body = "";
            String output = "";
  
            output += "Course_Name\t\t\t\tTotal_Class\tPresent\tAbsent\tPercent\n";
            try {
                Document info = Jsoup.connect(url + "attendance/att").ignoreContentType(true).header("token", token).header("id", uano).header("uatype", uatype).data("id", id+"").post();
                body = info.select("body").text();
                
                JSONArray arr = new JSONObject(body).getJSONArray("AttendanceDetails");
                
                for(int i=0; i<arr.length(); i++){
                    output += (String)arr.getJSONObject(i).getString("Course_Name");
                    if ( i == arr.length()-1)
                        output += "\t";
                    else 
                        output += "\t\t";
                    output += arr.getJSONObject(i).getInt("Total_Class") + "\t";
                    output += arr.getJSONObject(i).getInt("Present") + "\t";
                    output += arr.getJSONObject(i).getInt("Absent") + "\t";
                    output += (int)((float)arr.getJSONObject(i).getInt("Present")/(float)arr.getJSONObject(i).getInt("Total_Class") * 100) + "%\n";
          
                }
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            return output;
        }
}

