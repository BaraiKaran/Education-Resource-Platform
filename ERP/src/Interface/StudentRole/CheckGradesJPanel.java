/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.StudentRole;

import Business.Assignment.Assignment;
import Business.AssignmentSubmission.Submission;
import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class CheckGradesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckGradesJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization organization;
    UserAccount ua;
    Program program;

    public CheckGradesJPanel(JPanel userProcessContainer, UserAccount ua, Organization organization, Program program) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.program = program;
        this.organization = (CollegeOrganization) organization;
        populateCourses();
        
        tblSubmissionDetails.getTableHeader().setFont(new Font("Tahoma", Font.CENTER_BASELINE, 18));

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbAssignment = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubmissionDetails = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Assignment Grades");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Course :");

        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });
        cmbCourse.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbCoursePropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Assignment :");

        cmbAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAssignmentActionPerformed(evt);
            }
        });
        cmbAssignment.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbAssignmentPropertyChange(evt);
            }
        });

        tblSubmissionDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblSubmissionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Assignment", "Submitted on", "Marks", "Out of"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSubmissionDetails.setRowHeight(20);
        jScrollPane1.setViewportView(tblSubmissionDetails);

        backbtn.setBackground(new java.awt.Color(51, 153, 255));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<< Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 430, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        // TODO add your handling code here:

        Object obj = evt.getSource();
        if (obj == cmbCourse) {
            cmbAssignment.removeAllItems();
            Courses course = (Courses) cmbCourse.getSelectedItem();
            for (Assignment as : course.getAssignment().getAssignmentDirectory()) {
                cmbAssignment.addItem(as);
            }
        }
    }//GEN-LAST:event_cmbCourseActionPerformed

    public void populateCourses() {
        cmbCourse.removeAllItems();
        for (Courses c : program.getCourses().getCourseList()) {
            for (UserAccount user : c.getStudents()) {
                if (ua.getId() == user.getId()) {
                    cmbCourse.addItem(c);
                }
            }
        }
    }

    private void cmbCoursePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbCoursePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCoursePropertyChange

    private void cmbAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAssignmentActionPerformed
        // TODO add your handling code here:
        populateTable();
        /*        Object obj = evt.getSource();
        if (obj == cmbCousreName) {
            cmbStudentsName.removeAllItems();
            for(Program pd : organization.getPD().getDirectory()){
                for (Courses c : pd.getCourses().getCourseList()) {
                    for (UserAccount ua : c.getStudents()) {
                        String courseName = String.valueOf(cmbCousreName.getSelectedItem());
                        if (c.getCourseName().equals(courseName)) {
                            cmbStudentsName.addItem(ua);
                        }
                    }
                }
            }
        }
         */
    }//GEN-LAST:event_cmbAssignmentActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblSubmissionDetails.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for (Courses course : program.getCourses().getCourseList()) {
            for (Assignment as : course.getAssignment().getAssignmentDirectory()) {
                for (Submission s : as.getSubmissionDirectory().getSubmission()) {
                    if (ua.getId() == s.getStudent().getId()) {
                        if (course.getCourseName().equals(String.valueOf(cmbCourse.getSelectedItem()))) {
                            row[0] = course;
                            row[1] = as.getTitle();
                            row[2] = s.getSubmittedOn();
                            row[3] = s.getMarks();
                            row[4] = as.getMaxScore();
                            model.addRow(row);
                        }
                    }
                }
            }
        }

    }

    private void cmbAssignmentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbAssignmentPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAssignmentPropertyChange

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StudentWorkAreaJPanel panel = (StudentWorkAreaJPanel) component;
        panel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox cmbAssignment;
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSubmissionDetails;
    // End of variables declaration//GEN-END:variables
}
