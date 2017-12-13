/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TARole;

import Business.College.Program;
import Business.Courses.Courses;
import Business.Organization.CollegeOrganization;
import Business.Role.TAHours;
import Business.Role.TARole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krunal
 */
public class WorkingHoursJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkingHoursJPanel
     */
       JPanel userProcessContainer;
    CollegeOrganization organization;
    UserAccount userAccount;
    Program program;
    Courses course;
    public WorkingHoursJPanel() {
        initComponents();
    }

    public WorkingHoursJPanel(JPanel userProcessContainer, Program program, UserAccount userAccount, CollegeOrganization organization, Courses course) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = userAccount;
        TARole role = (TARole) userAccount.getRole();
        this.course = role.getCourse();
       
        populateTable();
        
        tblTAHours.getTableHeader().setFont(new Font("Tahoma", Font.CENTER_BASELINE, 18));

        
        
    }

     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblTAHours.getModel();
        model.setRowCount(0);
        TARole role = (TARole) userAccount.getRole();
        Object[] row = new Object[6];
        
        for (TAHours r : role.getTahours()) {
            row[0] = role.getCourse();
            row[1] = r.getDate();
            row[2] = r.getStartTime();
            row[3] = r.getEndTime();
            row[4] = (r.getTimeDuration() / 60000);
            row[5] = r;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTAHours = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Working Hours");

        tblTAHours.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblTAHours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Date", "Start Time", "End Time", "Total Hours", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTAHours.setRowHeight(20);
        jScrollPane1.setViewportView(tblTAHours);

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
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(backbtn)
                .addContainerGap(301, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTAHours;
    // End of variables declaration//GEN-END:variables
}
