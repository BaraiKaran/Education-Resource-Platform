/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ProfessorRole;

import Business.Assignment.*;
import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.TrayIconDemo;
import Business.UserAccount.UserAccount;
import Business.Validations;
import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.SystemTray;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karan
 */
public class AssignmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignTAJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization organization;
    UserAccount userAccount;
    Program program;
    String uname;

    public AssignmentJPanel(JPanel userProcessContainer, Program program, UserAccount userAccount, CollegeOrganization organization, String username) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.program = program;
        this.userAccount = userAccount;
        this.organization = (CollegeOrganization) organization;
        this.uname = username;
        populateCombo();
    }

    public void populateCombo() {
        cmbCousreName.removeAllItems();
        //CourseDirectory cd = program.getCourses();
        for (Program pd : organization.getPD().getDirectory()) {
            for (Courses c : pd.getCourses().getCourseList()) {
                if (c.getProfessor().getUsername().equals(uname) && c.getApprovalStatus().equals("Approved")) {
                    cmbCousreName.addItem(c);
                }
            }
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

        jLabel1 = new javax.swing.JLabel();
        cmbCousreName = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAn = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Assignment");

        cmbCousreName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCousreNameActionPerformed(evt);
            }
        });
        cmbCousreName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbCousreNamePropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Course Name:");

        txtAn.setColumns(20);
        txtAn.setRows(5);
        jScrollPane1.setViewportView(txtAn);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Title :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Problem Statement : ");

        btnSubmit.setBackground(new java.awt.Color(51, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(51, 153, 255));
        backbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<<Back");
        backbtn.setToolTipText("");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitle)
                                    .addComponent(cmbCousreName, 0, 171, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCousreName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addGap(33, 33, 33)
                .addComponent(backbtn)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCousreNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCousreNameActionPerformed
        // TODO add your handling code here:
        return;
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
    }//GEN-LAST:event_cmbCousreNameActionPerformed

    private void cmbCousreNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbCousreNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCousreNamePropertyChange

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        if (txtAn.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "announcement cannot be blank.");
            return;
        }

        if (txtTitle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter title");
            return;
        }

        if (Validations.isTextLong(txtTitle.getText())) {
            JOptionPane.showMessageDialog(null, "Title cannot exceed 20 characters");
            return;
        }

        Courses c = (Courses) cmbCousreName.getSelectedItem();
        for (Assignment a : c.getAssignment().getAssignmentDirectory()) {
            if (a.getTitle().toLowerCase().equals(txtTitle.getText().toLowerCase())) {
                JOptionPane.showMessageDialog(null, "Assignment title has to be unique");
                return;
            }
        }

        Courses cr = (Courses) cmbCousreName.getSelectedItem();
        Assignment as = cr.getAssignment().addAssignment(txtTitle.getText(), txtAn.getText());

        for (UserAccount ua : cr.getStudents()) {
            ua.createFeeds("Professor " + userAccount.getEmployee().getName() + " released new Assignment " + as.getTitle());
        }
        for (UserAccount ua : cr.getTeachingAssistant()) {
            ua.createFeeds("Professor " + userAccount.getEmployee().getName() + " released new Assignment " + as.getTitle());

        }
        new File("C:\\Assignment_submission\\" + String.valueOf(cmbCousreName.getSelectedItem()) + "\\" + txtTitle.getText()).mkdir();

        /* Code to show windows notification */
        if (SystemTray.isSupported()) {
            TrayIconDemo td = new TrayIconDemo();
            try {
                td.displayTray(as.getTitle(), "Submitted Successfully");
            } catch (AWTException e) {

            } catch (MalformedURLException e) {

            }
        } else {
            System.err.println("System tray not supported!");
        }
        /* */
        //JOptionPane.showMessageDialog(null, "Submitted successfully");

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbCousreName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAn;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
