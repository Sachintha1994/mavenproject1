/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StudentManagement;

import Classes.Student;
import Classes.StudentDetails;
import gui.DatePicker;

/**
 *
 * @author sachi
 */
public class StudentDetailsGUI extends javax.swing.JFrame {

 

    /**
     * Creates new form StudentDetails
     */
    public StudentDetailsGUI() {
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
        txtStudentDetailForm = new javax.swing.JLabel();
        iui = new javax.swing.JLabel();
        ioi = new javax.swing.JLabel();
        li = new javax.swing.JLabel();
        rtty = new javax.swing.JLabel();
        iop = new javax.swing.JLabel();
        eer = new javax.swing.JLabel();
        kkl = new javax.swing.JLabel();
        txtEnrollmentDate = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        txtStudentId = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        cmbDegreeProgram = new javax.swing.JComboBox<>();
        btnDateOfBirth = new javax.swing.JToggleButton();
        btnEnrollmentDate = new javax.swing.JToggleButton();
        btnAddStudentToTextFile = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtStudentDetailForm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtStudentDetailForm.setText("Student Detail Form");

        iui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iui.setText("Student Name :");

        ioi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ioi.setText("Student ID :");

        li.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        li.setText("Date of Birth :");

        rtty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtty.setText("Address :");

        iop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iop.setText("Enrollment Date :");

        eer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eer.setText("Mobile Number :");

        kkl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kkl.setText("Degree Program:");

        txtEnrollmentDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEnrollmentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnrollmentDateActionPerformed(evt);
            }
        });

        txtStudentName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtStudentId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cmbDegreeProgram.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbDegreeProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Degree Programme", "Computer Science", "Software Engineering", "Networking", "Cyber Security" }));

        btnDateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDateOfBirth.setText("Select Date");
        btnDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateOfBirthActionPerformed(evt);
            }
        });

        btnEnrollmentDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEnrollmentDate.setText("Select Date");
        btnEnrollmentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollmentDateActionPerformed(evt);
            }
        });

        btnAddStudentToTextFile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddStudentToTextFile.setText("Add Student to Text File");
        btnAddStudentToTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentToTextFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(txtStudentDetailForm, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ioi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(iop)
                                            .addComponent(li))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEnrollmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEnrollmentDate)
                                            .addComponent(btnDateOfBirth)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rtty)
                                        .addGap(80, 80, 80)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(kkl)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbDegreeProgram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(eer)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnAddStudentToTextFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtStudentDetailForm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iui)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ioi)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(li)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDateOfBirth))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iop)
                    .addComponent(txtEnrollmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnrollmentDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtty)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eer)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kkl)
                    .addComponent(cmbDegreeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnAddStudentToTextFile)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateOfBirthActionPerformed
        DatePicker datePicker = new DatePicker(this);
       txtDateOfBirth.setText(datePicker.setPickedDate()); //txtDateOfBirth.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_btnDateOfBirthActionPerformed
    
    private void btnAddStudentToTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentToTextFileActionPerformed
        
        String studentName = txtStudentName.getText();
        String studentId = txtStudentId.getText();
        String dateOfBirth = txtDateOfBirth.getText();
        String enrollmentDate = txtEnrollmentDate.getText();
        String address = txtAddress.getText();
        String mobileNumber = txtMobileNumber.getText();
        String degreeprogram = cmbDegreeProgram.getSelectedItem().toString();
        
        Student student = new Student(studentName,studentId,dateOfBirth,enrollmentDate,address,mobileNumber,degreeprogram);
        
        StudentDetails studentDetails = new StudentDetails();
        
        studentDetails.addStudentToTextFile(student);
        
        
        
        
    }//GEN-LAST:event_btnAddStudentToTextFileActionPerformed

    private void txtEnrollmentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnrollmentDateActionPerformed
        
    }//GEN-LAST:event_txtEnrollmentDateActionPerformed

    private void btnEnrollmentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollmentDateActionPerformed
        DatePicker datePicker = new DatePicker(this);
       txtEnrollmentDate.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_btnEnrollmentDateActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentDetailsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddStudentToTextFile;
    private javax.swing.JToggleButton btnDateOfBirth;
    private javax.swing.JToggleButton btnEnrollmentDate;
    private javax.swing.JComboBox<String> cmbDegreeProgram;
    private javax.swing.JLabel eer;
    private javax.swing.JLabel ioi;
    private javax.swing.JLabel iop;
    private javax.swing.JLabel iui;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kkl;
    private javax.swing.JLabel li;
    private javax.swing.JLabel rtty;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEnrollmentDate;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JLabel txtStudentDetailForm;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables

    
}
