/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.StudentRole;

import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class ActiveRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ActiveRegistrationJPanel
     */
    private CollegeOrganization organization;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Program program;

    public ActiveRegistrationJPanel(JPanel userProcessContainer, UserAccount ua, CollegeOrganization organization, Program program) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = ua;
        this.program = program;

        populateTable();

        tblCoursesRegistered.getTableHeader().setFont(new Font("Tahoma", Font.CENTER_BASELINE, 18));

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCoursesRegistered = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        btnDropCourse = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Active Registration");

        tblCoursesRegistered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CRN Number", "Course Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCoursesRegistered);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Courses Registered:");

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

        btnDropCourse.setBackground(new java.awt.Color(51, 153, 255));
        btnDropCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnDropCourse.setText("Drop Course");
        btnDropCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDropCourse)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnDropCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void btnDropCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropCourseActionPerformed
        // TODO add your handling code here:
        int selected = tblCoursesRegistered.getSelectedRow();
        {
            if (selected >= 0) {
                Courses c = (Courses) tblCoursesRegistered.getValueAt(selected, 1);
                c.removeStudent(userAccount);
                c.setTotalSeats(c.getTotalSeats() + 1);
                populateTable();
                JOptionPane.showMessageDialog(null, "You have droppped the course " + c.getCourseName());

            } else {
                JOptionPane.showMessageDialog(null, "Please select a row");
            }
        }
    }//GEN-LAST:event_btnDropCourseActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCoursesRegistered.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];

        for (Courses c : program.getCourses().getCourseList()) {
            for (UserAccount user : c.getStudents()) {
                if (userAccount.getId() == user.getId()) {
                    row[0] = c.getCrnNumber();
                    row[1] = c;
                    model.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnDropCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCoursesRegistered;
    // End of variables declaration//GEN-END:variables
}
