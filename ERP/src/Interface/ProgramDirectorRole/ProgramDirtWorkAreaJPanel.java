/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ProgramDirectorRole;

import Business.College.Program;
import Business.Feeds.Feeds;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakas
 */
public class ProgramDirtWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization organization;
    UserAccount userAccount;
    Program program;

    public ProgramDirtWorkAreaJPanel(JPanel userProcessContainer, Organization org, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) org;
        this.userAccount = ua;
        for (Program prog : this.organization.getPD().getDirectory()) {
            if (prog.getProgramDirector().getId() == userAccount.getId()) {
                this.program = prog;
                break;
            }
        }

        populateTable();

        tblFeeds.getTableHeader().setFont(new Font("Tahoma", Font.CENTER_BASELINE, 18));

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFeeds.getModel();
        model.setRowCount(0);

        //for (Program pd : .getPD().getDirectory()) {
        Object[] row = new Object[2];
        for (Feeds fd : userAccount.getFeedsList()) {
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

        jLabel2 = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeeds = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Program Director");

        manageOrganizationJButton.setBackground(new java.awt.Color(51, 153, 255));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Course");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        tblFeeds.setAutoCreateRowSorter(true);
        tblFeeds.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        tblFeeds.setRowHeight(20);
        jScrollPane1.setViewportView(tblFeeds);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(manageOrganizationJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        if (!(program instanceof Program)) {
            JOptionPane.showMessageDialog(null, "Program not added");
            return;
        }

        ManageCourseJPanel panel = new ManageCourseJPanel(userProcessContainer, program, userAccount);
        userProcessContainer.add("ManageCourseJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JTable tblFeeds;
    // End of variables declaration//GEN-END:variables
}
