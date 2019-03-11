/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdiary;

import javax.swing.JOptionPane;

/**
 *
 * @author lalitmunne
 */
public class StudentDiary extends javax.swing.JFrame {

    /**
     * Creates new form StudentDiary
     */
    
    private Connect c;
    private String output_info;
    private String output_internal;
    private String[] intr_session;
    private String[] result_session;
    public StudentDiary() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        en_no_input = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        info_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputArea = new javax.swing.JTextArea();
        int_mrk_cmb_bx = new javax.swing.JComboBox<>();
        int_mrk_sem_cmb_bx = new javax.swing.JComboBox<>();
        result_cmb_bx = new javax.swing.JComboBox<>();
        result_sem_cmb_bx = new javax.swing.JComboBox<>();
        attendance = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enrollment Number :");

        en_no_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                en_no_inputActionPerformed(evt);
            }
        });

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        info_btn.setText("Information");
        info_btn.setEnabled(false);
        info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_btnActionPerformed(evt);
            }
        });

        OutputArea.setEditable(false);
        OutputArea.setColumns(20);
        OutputArea.setRows(5);
        jScrollPane1.setViewportView(OutputArea);

        int_mrk_cmb_bx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internal Marks" }));
        int_mrk_cmb_bx.setEnabled(false);
        int_mrk_cmb_bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_mrk_cmb_bxActionPerformed(evt);
            }
        });

        int_mrk_sem_cmb_bx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem" }));
        int_mrk_sem_cmb_bx.setEnabled(false);
        int_mrk_sem_cmb_bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_mrk_sem_cmb_bxActionPerformed(evt);
            }
        });

        result_cmb_bx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Result" }));
        result_cmb_bx.setEnabled(false);
        result_cmb_bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_cmb_bxActionPerformed(evt);
            }
        });

        result_sem_cmb_bx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sem" }));
        result_sem_cmb_bx.setEnabled(false);
        result_sem_cmb_bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_sem_cmb_bxActionPerformed(evt);
            }
        });

        attendance.setText("Attendance");
        attendance.setEnabled(false);
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });

        jLabel2.setText("Password :");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(info_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(int_mrk_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(int_mrk_sem_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(result_cmb_bx, 0, 214, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(result_sem_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(attendance))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(submit_btn)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(en_no_input, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(pass_input))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_no_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(submit_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info_btn)
                    .addComponent(int_mrk_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_mrk_sem_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_sem_cmb_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendance))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuBar.setName(""); // NOI18N

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
   
    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:   
      try { 
        int enroll_no = Integer.parseInt(en_no_input.getText());    
        int password = Integer.parseInt(new String(pass_input.getPassword()));
        c = new Connect(enroll_no, password);
        output_info = c.connect(enroll_no);
        intr_session = c.getUnique("internal");
        result_session = c.getUnique("result");
        int_mrk_cmb_bx.setEnabled(true);
        result_cmb_bx.setEnabled(true);
        attendance.setEnabled(true);
        for(String s: intr_session)
            int_mrk_cmb_bx.addItem(s);
        for(String s: result_session)
            result_cmb_bx.addItem(s);
        info_btn.setEnabled(true);
      } catch (Exception e) {
          
      }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_btnActionPerformed
        // TODO add your handling code here:
        OutputArea.setText(output_info);
    }//GEN-LAST:event_info_btnActionPerformed

    private void int_mrk_cmb_bxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_mrk_cmb_bxActionPerformed
        // TODO add your handling code here:
        int_mrk_sem_cmb_bx.setEnabled(true);
        String session = (String)int_mrk_cmb_bx.getSelectedItem();
        int_mrk_sem_cmb_bx.removeAllItems();
        String sems[] = c.getSem("internal",session);
        for(String s: sems)
            int_mrk_sem_cmb_bx.addItem(s);
        
    }//GEN-LAST:event_int_mrk_cmb_bxActionPerformed

    private void int_mrk_sem_cmb_bxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_mrk_sem_cmb_bxActionPerformed
        // TODO add your handling code here:
        String session = (String)int_mrk_cmb_bx.getSelectedItem();
        String sem = (String)int_mrk_sem_cmb_bx.getSelectedItem();
        if (!(sem == null)) {
        output_internal = c.getSemNoSessNo("internal", session, sem);
        OutputArea.setText(output_internal);
        }
    }//GEN-LAST:event_int_mrk_sem_cmb_bxActionPerformed

    private void result_cmb_bxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_cmb_bxActionPerformed
        // TODO add your handling code here:
        result_sem_cmb_bx.setEnabled(true);
        String session = (String)result_cmb_bx.getSelectedItem();
        result_sem_cmb_bx.removeAllItems();
        String sems[] = c.getSem("result",session);
        for(String s: sems)
            result_sem_cmb_bx.addItem(s);
    }//GEN-LAST:event_result_cmb_bxActionPerformed

    private void result_sem_cmb_bxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_sem_cmb_bxActionPerformed
        // TODO add your handling code here:
        String session = (String)result_cmb_bx.getSelectedItem();
        String sem = (String)result_sem_cmb_bx.getSelectedItem();
        if (!(sem == null)) {
        output_internal = c.getSemNoSessNo("result", session, sem);
        OutputArea.setText(output_internal);
        }
        
    }//GEN-LAST:event_result_sem_cmb_bxActionPerformed

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
        // TODO add your handling code here:
        String output;
        output = c.getAttendance();
        OutputArea.setText(output);
    }//GEN-LAST:event_attendanceActionPerformed

    private void en_no_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_en_no_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_en_no_inputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDiary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea OutputArea;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton attendance;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JTextField en_no_input;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton info_btn;
    private javax.swing.JComboBox<String> int_mrk_cmb_bx;
    private javax.swing.JComboBox<String> int_mrk_sem_cmb_bx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JComboBox<String> result_cmb_bx;
    private javax.swing.JComboBox<String> result_sem_cmb_bx;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables

}
