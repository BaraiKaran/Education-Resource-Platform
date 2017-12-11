/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TARole;

import Business.College.Program;
import Business.Courses.Courses;
import Business.Feeds.Feeds;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.Role.TAHours;
import Business.Role.TARole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakas
 */
public class TAWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TAWorkAreaJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization organization;
    UserAccount userAccount;
    Program program;
    Courses course;

    public TAWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = account;
        TARole role = (TARole) userAccount.getRole();
        this.course = role.getCourse();
        if (role.getTaHours()) {
            btnStartTAHours.setEnabled(false);
        } else {
            btnEndTAHours.setEnabled(false);
        }
        populateTable();
        populateFeeds();
    }

    
     public void populateFeeds() {

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
        btnStartTAHours = new javax.swing.JButton();
        btnEndTAHours = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTAHours = new javax.swing.JTable();
        btnAnouncement = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFeeds = new javax.swing.JTable();
        btnTIme = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Teaching Assistant");

        btnStartTAHours.setForeground(new java.awt.Color(255, 255, 255));
        btnStartTAHours.setText("Start TA hours");
        btnStartTAHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartTAHoursActionPerformed(evt);
            }
        });

        btnEndTAHours.setForeground(new java.awt.Color(255, 255, 255));
        btnEndTAHours.setText("End TA hours");
        btnEndTAHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndTAHoursActionPerformed(evt);
            }
        });

        tblTAHours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Date", "Start Time", "End Time", "Total Hours"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTAHours);

        btnAnouncement.setBackground(new java.awt.Color(51, 153, 255));
        btnAnouncement.setForeground(new java.awt.Color(255, 255, 255));
        btnAnouncement.setText("Anouncements");
        btnAnouncement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnouncementActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(tblFeeds);

        btnTIme.setBackground(new java.awt.Color(51, 153, 255));
        btnTIme.setForeground(new java.awt.Color(255, 255, 255));
        btnTIme.setText("Assignment Time Slots");
        btnTIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTImeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnStartTAHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEndTAHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAnouncement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartTAHours)
                        .addGap(39, 39, 39)
                        .addComponent(btnEndTAHours)
                        .addGap(40, 40, 40)
                        .addComponent(btnAnouncement))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTIme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblTAHours.getModel();
        model.setRowCount(0);
        TARole role = (TARole) userAccount.getRole();
        Object[] row = new Object[5];
        /* for (Program pd : organization.getPD().getDirectory()) {
            for (Courses c : pd.getCourses().getCourseList()) {
                for (UserAccount ua : c.getTeachingAssistant()) {
                    if (ua.getId() == userAccount.getId()) {
                        TARole r = (TARole) ua.getRole();
                        row[0] = c;
                        row[1] = r.getDate();
                        row[2] = r.getStartTime();
                        row[3] = r.getEndTime();
                        row[4] = (r.getTimeDuration() / 60000);
                        model.addRow(row);

                    }
                }
            }
        }*/
        for (TAHours r : role.getTahours()) {
            row[0] = role.getCourse();
            row[1] = r.getDate();
            row[2] = r.getStartTime();
            row[3] = r.getEndTime();
            row[4] = (r.getTimeDuration() / 60000);
            model.addRow(row);
        }

    }

    private void btnStartTAHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartTAHoursActionPerformed
        // TODO add your handling code here:
        TARole role = (TARole) userAccount.getRole();
        TAHours active = role.getActive();
        role.setTaHours(true);
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
        Date d1 = new Date();
        active.setDate(formatter1.format(d1));

        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String s = formatter.format(d);
        active.setStartTime(s);
        btnStartTAHours.setEnabled(false);
        btnEndTAHours.setEnabled(true);
        /*for (Program pd : organization.getPD().getDirectory()) {
            for (Courses c : pd.getCourses().getCourseList()) {
                for (UserAccount ua : c.getTeachingAssistant()) {
                    if (ua.getId() == userAccount.getId()) {
                        TARole r = (TARole) ua.getRole();
                        r.setTaHours(true);
                        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
                        Date d1 = new Date();
                        r.setDate(formatter1.format(d1));

                        Date d = new Date();
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        String s = formatter.format(d);

                        r.setStartTime(s);

                    }

                }

            }
        }*/

    }//GEN-LAST:event_btnStartTAHoursActionPerformed

    private void btnEndTAHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndTAHoursActionPerformed
        // TODO add your handling code here:
        TARole role = (TARole) userAccount.getRole();
        TAHours active = role.getActive();
        role.setTaHours(false);
        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String e = formatter.format(d);
        active.setEndTime(e);
        try {
            long diff = d.getTime() - formatter.parse(active.getStartTime()).getTime();
            active.setTimeDuration(diff);

            TAHours TAhrs = role.addTAHours();
            TAhrs.setDate(active.getDate());
            TAhrs.setEndTime(active.getEndTime());
            TAhrs.setStartTime(active.getStartTime());
            TAhrs.setTimeDuration(active.getTimeDuration());
            btnStartTAHours.setEnabled(true);
            btnEndTAHours.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(TAWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*for (Program pd : organization.getPD().getDirectory()) {
            for (Courses c : pd.getCourses().getCourseList()) {
                for (UserAccount ua : c.getTeachingAssistant()) {
                    if (ua.getId() == userAccount.getId()) {
                        TARole r = (TARole) ua.getRole();
                        r.setTaHours(false);
                        Date d = new Date();
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        String e = formatter.format(d);
                        r.setEndTime(e);
                        try {
                            long diff = d.getTime() - formatter.parse(r.getStartTime()).getTime();
                            r.setTimeDuration(diff);
                        } catch (ParseException ex) {
                            Logger.getLogger(TAWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

            }
        }*/
        populateTable();
    }//GEN-LAST:event_btnEndTAHoursActionPerformed

    private void btnAnouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnouncementActionPerformed
        // TODO add your handling code here:

        AnouncementJPanel JPanel = new AnouncementJPanel(userProcessContainer, program, userAccount, organization, course);
        userProcessContainer.add("AnouncementJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAnouncementActionPerformed

    private void btnTImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTImeActionPerformed
        // TODO add your handling code here:
          TimeSlotJPanel JPanel = new TimeSlotJPanel(userProcessContainer, program, userAccount, organization, course);
        userProcessContainer.add("TimeSlotJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTImeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnouncement;
    private javax.swing.JButton btnEndTAHours;
    private javax.swing.JButton btnStartTAHours;
    private javax.swing.JButton btnTIme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFeeds;
    private javax.swing.JTable tblTAHours;
    // End of variables declaration//GEN-END:variables
}
