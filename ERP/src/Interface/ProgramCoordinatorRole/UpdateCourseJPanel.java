/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ProgramCoordinatorRole;

import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Validations;
import Interface.CollegeAdmin.ManageProgramJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aakas
 */
public class UpdateCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCourseJPanel
     */
    
    private JPanel userprocesscontainer;
    private Program program;
    private UserAccount userAccount;
    private Courses courses;
    public UpdateCourseJPanel(JPanel userProcessContainer, Program program, UserAccount userAccount, Courses course) {
        initComponents();
        this.userprocesscontainer = userProcessContainer;
        this.program = program;
        this.userAccount = userAccount;
        this.courses = course;
        
        savebtn.setEnabled(false);
        txtCRN.setEnabled(false);
        txtName.setEnabled(false);
        cmbProfessorName.setEnabled(false);
        txtTotalSeats.setEnabled(false);
        updatebtn.setEnabled(true);
        
        populatedetails();
        populatecombobox();
    }

    public void populatedetails(){
        txtCRN.setText(String.valueOf(courses.getCrnNumber()));
        txtName.setText(courses.getCourseName());
        txtTotalSeats.setText(String.valueOf(courses.getTotalSeats()));
    }
    
    public void populatecombobox(){
        cmbProfessorName.removeAllItems();
        for (Courses c : program.getCourses().getCourseList()){
            cmbProfessorName.addItem(c.getProfessor());
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCRN = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbProfessorName = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtTotalSeats = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Update Course ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Course Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CRN:");

        txtCRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCRNActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(51, 153, 255));
        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 153, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Professor Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total Seats:");

        savebtn.setBackground(new java.awt.Color(51, 153, 255));
        savebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtCRN)
                            .addComponent(cmbProfessorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(updatebtn)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCRN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn)
                    .addComponent(savebtn)
                    .addComponent(btnBack))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCRNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCRNActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
         savebtn.setEnabled(true);
         updatebtn.setEnabled(false);
         txtCRN.setEnabled(true);
         txtName.setEnabled(true);
         cmbProfessorName.setEnabled(true);
         txtTotalSeats.setEnabled(true); 
                   

        
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        
        Component[] componentArray = userprocesscontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCourseJPanel panel = (ManageCourseJPanel) component;
        panel.populateTable(); 
        
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
      
    }//GEN-LAST:event_btnBackActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
         if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the details");
            return;
        }
             if(Validations.isTextLong(txtName.getText())) {
                JOptionPane.showMessageDialog(null, "Program name cannot exceed 20 characters");
                return;
            }
          if (Validations.isTextFieldEmpty(txtCRN.getText()) && Validations.isTextFieldEmpty(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "CRN Number and/or Course name cannot be blank!");
        } else {
            int crn, totalSeats;
            try {
                crn = Integer.parseInt(txtCRN.getText());
            } catch (NumberFormatException num) {
                JOptionPane.showMessageDialog(null, "CRN Number has to be an integer value.");
                return;
            }
                for (Courses c : program.getCourses().getCourseList()) {
                if (c.getCrnNumber() == Integer.parseInt(txtCRN.getText())) {
                    JOptionPane.showMessageDialog(null, "CRN number already exists.");
                    return;
                }
            }

                String coursename = txtName.getText().trim();
            try {
                totalSeats = Integer.parseInt(txtTotalSeats.getText());
            } catch (NumberFormatException num) {
                JOptionPane.showMessageDialog(null, "Total seats has to be an integer value.");
                return;
            }

            if (totalSeats < 0) {
                JOptionPane.showMessageDialog(null, "Total seats cannot be negative.");
                return;
            }   
          }
          courses.setCrnNumber(Integer.parseInt(txtCRN.getText()));
          courses.setCourseName(txtName.getText());
          courses.setTotalSeats(Integer.parseInt(txtTotalSeats.getText()));
          UserAccount prof = (UserAccount)cmbProfessorName.getSelectedItem();
          courses.setProfessor(prof);
        
          txtCRN.setEnabled(false);
          txtName.setEnabled(false);
          cmbProfessorName.setEnabled(false);
          txtTotalSeats.setEnabled(false);  
          savebtn.setEnabled(false);
          updatebtn.setEnabled(true);
       
        JOptionPane.showMessageDialog(null, "Program Updated");
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbProfessorName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField txtCRN;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTotalSeats;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
