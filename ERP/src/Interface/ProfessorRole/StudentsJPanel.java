/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ProfessorRole;

import Business.Assignment.Assignment;
import Business.AssignmentSubmission.Submission;
import Business.College.Program;
import Business.Courses.Courses;
import Business.Marks.MarksDirectory;
import Business.Organization.CollegeOrganization;
import Business.Role.StudentRole;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author karan
 */
public class StudentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignTAJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization organization;
    UserAccount userAccount;
    Program program;
    String uname;

    StudentsJPanel(JPanel userProcessContainer, Program program, UserAccount userAccount, CollegeOrganization organization, String username) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.program = program;
        this.userAccount = userAccount;
        this.organization = (CollegeOrganization) organization;
        this.uname = username;
        populateCourses();

        // populateStudents();
        //populateTable();
        //populateRequest();
    }

    public void populateCourses() {
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

    public void populateStudents() {
        cmbStudents.removeAllItems();
        Courses cr = (Courses) cmbCousreName.getSelectedItem();
        MarksDirectory mdir = cr.getMarks();
        for (UserAccount ua : cr.getStudents()) {

            if (ua.getRole() instanceof StudentRole) {
                cmbStudents.addItem(ua);
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
        jLabel2 = new javax.swing.JLabel();
        cmbCousreName = new javax.swing.JComboBox();
        backbtn = new javax.swing.JButton();
        cmbStudents = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        barPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Grade Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Course Name:");

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

        cmbStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentsActionPerformed(evt);
            }
        });
        cmbStudents.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbStudentsPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Students :");

        javax.swing.GroupLayout barPanelLayout = new javax.swing.GroupLayout(barPanel);
        barPanel.setLayout(barPanelLayout);
        barPanelLayout.setHorizontalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barPanelLayout.setVerticalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCousreName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 501, Short.MAX_VALUE))
                    .addComponent(barPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCousreName, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCousreNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCousreNameActionPerformed
        // TODO add your handling code here:

        populateStudents();

    }//GEN-LAST:event_cmbCousreNameActionPerformed

    private void cmbCousreNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbCousreNamePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbCousreNamePropertyChange

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void cmbStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentsActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        Courses cr = (Courses) cmbCousreName.getSelectedItem();
        UserAccount uu = (UserAccount) cmbStudents.getSelectedItem();
        for (Assignment as : cr.getAssignment().getAssignmentDirectory()) {
            for (Submission sb : as.getSubmissionDirectory().getSubmission()) {
                if (sb.getStudent().getId() == uu.getId()) {
                    dcd.setValue(sb.getMarks(), uu.getEmployee().getName(), as.getTitle());
                }
            }
        }
        // dcd.setValue(orgcount, "Organizations", "No. of Organizations");
        JFreeChart jchart = ChartFactory.createBarChart3D("Enterprise Statistics", "Entities", "Numbers", dcd, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartp = new ChartPanel(jchart, true);
        //  chartp.setDomainZoomable(true);
        chartp.setVisible(true);
        barPanel.removeAll();
        barPanel.setLayout(new java.awt.BorderLayout());
        barPanel.add(chartp, BorderLayout.CENTER);

        barPanel.validate();
    }//GEN-LAST:event_cmbStudentsActionPerformed

    private void cmbStudentsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbStudentsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStudentsPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JPanel barPanel;
    private javax.swing.JComboBox cmbCousreName;
    private javax.swing.JComboBox cmbStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
