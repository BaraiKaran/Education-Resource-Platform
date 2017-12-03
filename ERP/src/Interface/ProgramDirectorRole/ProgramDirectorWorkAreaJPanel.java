/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ProgramDirectorRole;

import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakas
 */
public class ProgramDirectorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProgramDirectorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization organization;
    Program program;
    UserAccount userAccount;

    public ProgramDirectorWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = userAccount;
        for (Program prog : this.organization.getPD().getDirectory()) {

            if (prog.getProgramDirector().getId() == userAccount.getId()) {

                this.program = prog;
                break;
            }
        }
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProgDirectorBoard = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Program Director");

        tblProgDirectorBoard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CRN", "Course Name", "Status", "Program"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProgDirectorBoard);
        if (tblProgDirectorBoard.getColumnModel().getColumnCount() > 0) {
            tblProgDirectorBoard.getColumnModel().getColumn(0).setResizable(false);
            tblProgDirectorBoard.getColumnModel().getColumn(1).setResizable(false);
            tblProgDirectorBoard.getColumnModel().getColumn(2).setResizable(false);
            tblProgDirectorBoard.getColumnModel().getColumn(3).setResizable(false);
        }

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApprove)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnApprove)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblProgDirectorBoard.getModel();
        int selected = tblProgDirectorBoard.getSelectedRow();
        if (selected >= 0) {
            Courses c = (Courses) tblProgDirectorBoard.getValueAt(selected, 1);
            if (c.getApprovalStatus().equals("Initiated")) {
                c.setApprovalStatus("Approved");
            }

        }
        populateTable();

    }//GEN-LAST:event_btnApproveActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblProgDirectorBoard.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for (Courses c : program.getCourses().getCourseList()) {
            row[0] = c.getCrnNumber();
            row[1] = c;
            row[2] = c.getApprovalStatus();
            row[3] = program;
            model.addRow(row);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProgDirectorBoard;
    // End of variables declaration//GEN-END:variables
}
