/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.StudentRole;

import Business.College.Program;
import Business.Courses.CourseDirectory;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.UserAccount.UserAccount;
import Business.Validations;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class StudentCourseRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseRegistrationJPanel
     */
    private CollegeOrganization organization;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Program program;

    StudentCourseRegistrationJPanel(JPanel userProcessContainer, UserAccount ua, CollegeOrganization organization, Program program) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = ua;
        this.program = program;

        populateTable();

    }
    //this.program = program;

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
        txtEnterCrn1 = new javax.swing.JTextField();
        txtEnterCrn2 = new javax.swing.JTextField();
        txtEnterCrn3 = new javax.swing.JTextField();
        txtEnterCrn4 = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourseDescriptions = new javax.swing.JTable();
        Searchbycrn = new javax.swing.JButton();
        crntextfield = new javax.swing.JTextField();
        Searchbyname = new javax.swing.JButton();
        nametextfield = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Course Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter CRN:");

        btnRegister.setBackground(new java.awt.Color(51, 153, 255));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        tblCourseDescriptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CRN Number", "Course Name", "Professor Name", "Total Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourseDescriptions);
        if (tblCourseDescriptions.getColumnModel().getColumnCount() > 0) {
            tblCourseDescriptions.getColumnModel().getColumn(0).setResizable(false);
            tblCourseDescriptions.getColumnModel().getColumn(1).setResizable(false);
            tblCourseDescriptions.getColumnModel().getColumn(2).setResizable(false);
            tblCourseDescriptions.getColumnModel().getColumn(3).setResizable(false);
        }

        Searchbycrn.setText("Search by CRN:");
        Searchbycrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbycrnActionPerformed(evt);
            }
        });

        crntextfield.setBackground(new java.awt.Color(240, 240, 240));
        crntextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crntextfieldActionPerformed(evt);
            }
        });

        Searchbyname.setText("Search by Name:");
        Searchbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbynameActionPerformed(evt);
            }
        });

        nametextfield.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegister)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtEnterCrn1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(txtEnterCrn2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(txtEnterCrn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(txtEnterCrn4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Searchbycrn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crntextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Searchbyname)
                                    .addGap(27, 27, 27)
                                    .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searchbycrn)
                    .addComponent(crntextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searchbyname)
                    .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEnterCrn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnterCrn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnterCrn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnterCrn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(65, 65, 65)
                .addComponent(btnRegister)
                .addGap(108, 108, 108))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblCourseDescriptions.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for (Courses c : program.getCourses().getCourseList()) {
            if (c.getApprovalStatus().equals("Approved")) {
                
                    if(!nametextfield.getText().equals("")){
                    if(!nametextfield.getText().equals(c.getCourseName()))
                    if (Integer.parseInt(crntextfield.getText()) != c.getCrnNumber())
                        continue;
                    }
                row[0] = c.getCrnNumber();
                row[1] = c.getCourseName();
                row[2] = c.getProfessor();
                row[3] = c.getTotalSeats();
                model.addRow(row);
            }
        }
    }

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        if (Validations.isTextFieldEmpty(txtEnterCrn1.getText()) && Validations.isTextFieldEmpty(txtEnterCrn2.getText()) && Validations.isTextFieldEmpty(txtEnterCrn3.getText()) && Validations.isTextFieldEmpty(txtEnterCrn4.getText())) {

            JOptionPane.showMessageDialog(null, "You must atleast enter one CRN number.");

        } else {
            String coursenames = "";
            Boolean registered = false;
            ArrayList<Integer> crnNumbers = new ArrayList<Integer>();
            if (!txtEnterCrn1.getText().trim().isEmpty()) {
                crnNumbers.add(Integer.parseInt(txtEnterCrn1.getText()));
            }
            if (!txtEnterCrn2.getText().trim().isEmpty()) {
                crnNumbers.add(Integer.parseInt(txtEnterCrn2.getText()));
            }
            if (!txtEnterCrn3.getText().trim().isEmpty()) {
                crnNumbers.add(Integer.parseInt(txtEnterCrn3.getText()));
            }
            if (!txtEnterCrn4.getText().trim().isEmpty()) {
                crnNumbers.add(Integer.parseInt(txtEnterCrn4.getText()));
            }
            CourseDirectory cd = program.getCourses();
            for (Integer number : crnNumbers) {
                for (Courses c : cd.getCourseList()) {
                    if (number != 0) {
                        if (c.getCrnNumber() == number) {
                            c.RegisterCourse(userAccount);
                            int seats = c.getTotalSeats();
                            coursenames += c.getCourseName() + ",";
                            seats -= 1;
                            c.setTotalSeats(seats);
                            registered = true;
                        }

                    }
                }
            }
            if (registered) {
                populateTable();
                JOptionPane.showMessageDialog(null, "You have successfully registered for entered courses.");
            }
            userAccount.createFeeds("Successfully Registered for course " + coursenames.substring(0, coursenames.length() - 1));
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void SearchbycrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbycrnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_SearchbycrnActionPerformed

    private void SearchbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbynameActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_SearchbynameActionPerformed

    private void crntextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crntextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crntextfieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Searchbycrn;
    private javax.swing.JButton Searchbyname;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField crntextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametextfield;
    private javax.swing.JTable tblCourseDescriptions;
    private javax.swing.JTextField txtEnterCrn1;
    private javax.swing.JTextField txtEnterCrn2;
    private javax.swing.JTextField txtEnterCrn3;
    private javax.swing.JTextField txtEnterCrn4;
    // End of variables declaration//GEN-END:variables
}
