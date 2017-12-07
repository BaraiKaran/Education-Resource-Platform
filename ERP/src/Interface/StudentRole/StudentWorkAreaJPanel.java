/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.StudentRole;

import Business.College.Program;
import Business.Feeds.Feeds;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krunal
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentWorkAreaJPanel
     */
    JPanel userProcessContainer;

    CollegeOrganization organization;
    UserAccount ua;
    Program program;

    public StudentWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.ua = ua;
        for (Program prog : this.organization.getPD().getDirectory()) {
            for (UserAccount u : prog.getStudents()) {
                if (u.getId() == ua.getId()) {
                    this.program = prog;
                    break;
                }
            }

        }

        populateTable();
    }

    public StudentWorkAreaJPanel(JPanel userProcessContainer, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFeeds.getModel();
        model.setRowCount(0);

        //for (Program pd : .getPD().getDirectory()) {
        Object[] row = new Object[2];
        for (Feeds fd : ua.getFeedsList()) {

            row[0] = fd.getMessage();
            row[1] = fd.getMessageTime();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeeds = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRegisterForCourses = new javax.swing.JButton();

        tblFeeds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Notifications", "Time"
            }
        ));
        jScrollPane1.setViewportView(tblFeeds);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Student");

        btnRegisterForCourses.setText("Register for courses");
        btnRegisterForCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterForCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegisterForCourses)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnRegisterForCourses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterForCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterForCoursesActionPerformed
        // TODO add your handling code here:
        StudentCourseRegistrationJPanel panel = new StudentCourseRegistrationJPanel(userProcessContainer, ua, organization, program);
        userProcessContainer.add("StudentCourseRegistrationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegisterForCoursesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterForCourses;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFeeds;
    // End of variables declaration//GEN-END:variables
}
