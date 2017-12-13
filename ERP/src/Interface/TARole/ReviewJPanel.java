/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TARole;

import Business.Assignment.Assignment;
import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.TimeSlots.TimeSlots;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krunal
 */
public class ReviewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReviewJPanel
     */
    private JPanel userProcessContainer;
    private CollegeOrganization organization;
    private UserAccount userAccount;
    private Program program;
    private Courses course;

    public ReviewJPanel() {
        initComponents();
    }

    public ReviewJPanel(JPanel userProcessContainer, Program program, UserAccount userAccount, CollegeOrganization organization, Courses course) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = userAccount;
        this.program = program;
        this.course = course;
        populateCombo();

        tblSlots.getTableHeader().setFont(new Font("Tahoma", Font.CENTER_BASELINE, 18));
    }

    public void populateCombo() {
        cmbAssignment.removeAllItems();

        for (Assignment as : course.getAssignment().getAssignmentDirectory()) {
            cmbAssignment.addItem(as);
        }
    }

    public void populateTable(Assignment as) {
        DefaultTableModel dtm = (DefaultTableModel) tblSlots.getModel();
        dtm.setRowCount(0);

        for (TimeSlots ts : as.getSlots().getSlots()) {
            Object[] row = new Object[6];
            row[0] = ts;
            row[3] = ts.getDate();
            row[1] = ts.getStart();
            row[2] = ts.getEnd();
            row[4] = ts.getStatus();
            if (ts.getStudent() instanceof UserAccount) {
                row[5] = ts.getStudent();

            } else {
                row[5] = "NA";
            }
            dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        cmbAssignment = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSlots = new javax.swing.JTable();
        btnStart = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Assignment Review");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Assignment :");

        tblSlots.setAutoCreateRowSorter(true);
        tblSlots.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblSlots.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time Slot", "Start Time", "End Time", "Date", "Status", "Student"
            }
        ));
        tblSlots.setRowHeight(20);
        jScrollPane1.setViewportView(tblSlots);

        btnStart.setBackground(new java.awt.Color(51, 153, 255));
        btnStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start Review");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(51, 153, 255));
        backbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<<Back");
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(backbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAssignmentActionPerformed
        // TODO add your handling code here:

        Assignment as = (Assignment) cmbAssignment.getSelectedItem();
        populateTable(as);

    }//GEN-LAST:event_cmbAssignmentActionPerformed

    private void cmbAssignmentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbAssignmentPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAssignmentPropertyChange

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        int selected = tblSlots.getSelectedRow();
        if (selected >= 0) {
            TimeSlots timeslot = (TimeSlots) tblSlots.getValueAt(selected, 0);
            Assignment assignment = (Assignment) cmbAssignment.getSelectedItem();
            AReviewJPanel JPanel = new AReviewJPanel(userProcessContainer, program, userAccount, organization, course, timeslot, assignment);
            userProcessContainer.add("ReviewJPanel", JPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a slot");
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TAWorkAreaJPanel panel = (TAWorkAreaJPanel) component;
        panel.populateTable();
        panel.populateFeeds();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox cmbAssignment;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSlots;
    // End of variables declaration//GEN-END:variables
}
