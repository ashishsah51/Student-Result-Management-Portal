/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student_Result_Management_System;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
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

        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        AddNewStudent = new javax.swing.JButton();
        InsertNewResult = new javax.swing.JButton();
        RegisteredStudent = new javax.swing.JButton();
        AllStudentResult = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CourseBox = new javax.swing.JComboBox<>();
        BranchBox = new javax.swing.JComboBox<>();
        NameField = new javax.swing.JTextField();
        FatherNameField = new javax.swing.JTextField();
        GenderBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        RollField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        AddNewStudent.setBackground(new java.awt.Color(0, 204, 204));
        AddNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddNewStudent.setText("Add New Student");
        AddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStudentActionPerformed(evt);
            }
        });

        InsertNewResult.setText("Insert New Result");
        InsertNewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertNewResultActionPerformed(evt);
            }
        });

        RegisteredStudent.setText("Registered Student");
        RegisteredStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisteredStudentActionPerformed(evt);
            }
        });

        AllStudentResult.setText("All Student Result");
        AllStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentResultActionPerformed(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(255, 51, 204));
        LogOut.setText("Logout");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(InsertNewResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisteredStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllStudentResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(AddNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(InsertNewResult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(RegisteredStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(AllStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CourseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Course", "BBA", "BCA", "B.Tech", "MBA", "MCA", "M.Tech" }));
        CourseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseBoxActionPerformed(evt);
            }
        });

        BranchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Branch", "CSE", "ECE", "EE", "Finance Marketing", "Human Resourse Management", "IT", "IT Management", "ME", " " }));
        BranchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchBoxActionPerformed(evt);
            }
        });

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        FatherNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherNameFieldActionPerformed(evt);
            }
        });

        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female", "Other" }));
        GenderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBoxActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student_Result_Management_System/icons8-submit-document-32.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Father's Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Roll Number");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Course");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Branch");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Gender");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(GenderBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BranchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CourseBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RollField)
                        .addComponent(FatherNameField)
                        .addComponent(NameField)))
                .addGap(136, 136, 136))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameField))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FatherNameField))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RollField))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseBox))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BranchBox))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 420, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_AddNewStudentActionPerformed

    private void InsertNewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNewResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new insertResult().setVisible(true);
    }//GEN-LAST:event_InsertNewResultActionPerformed

    private void RegisteredStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisteredStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudent().setVisible(true);
    }//GEN-LAST:event_RegisteredStudentActionPerformed

    private void AllStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new allStudentResult().setVisible(true);
    }//GEN-LAST:event_AllStudentResultActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String course = (String)CourseBox.getSelectedItem();
        String branch = (String)BranchBox.getSelectedItem();
        String rollNumber = RollField.getText();
        String name = NameField.getText();
        String fatherName = FatherNameField.getText();
        String gender = (String)GenderBox.getSelectedItem();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm", "root", "Ashish@1234");

            Statement st = con.createStatement();
            st.executeUpdate("Insert into student(rollno, course, branch, name, gender, fathername) values('"+rollNumber+"', '"+course+"', '"+branch+"', '"+name+"', '"+gender+"', '"+fatherName+"')");
            JOptionPane.showMessageDialog(null, "Data Updated Sucessfully");
            setVisible(false);
            new index().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBoxActionPerformed

    private void FatherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherNameFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void BranchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BranchBoxActionPerformed

    private void CourseBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseBoxActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewStudent;
    private javax.swing.JButton AllStudentResult;
    private javax.swing.JComboBox<String> BranchBox;
    private javax.swing.JComboBox<String> CourseBox;
    private javax.swing.JTextField FatherNameField;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JButton InsertNewResult;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton RegisteredStudent;
    private javax.swing.JTextField RollField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
