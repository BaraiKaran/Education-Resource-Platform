/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TARole;

import Business.College.Program;
import Interface.TARole.ClockLabel;
        
import Business.Courses.Courses;
import Business.Feeds.Feeds;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.Role.TAHours;
import Business.Role.TARole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

    public TAWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount account) throws ParseException {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = account;
        TARole role = (TARole) userAccount.getRole();
        this.course = role.getCourse();
        
        
        
        if (role.getTaHours()) {
            btnStartTAHours.setEnabled(false);
           
        TAHours active = role.getActive();
              Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String e = formatter.format(d);
         long diff = d. getTime() - formatter.parse(active.getStartTime()).getTime();
        int h =0 ;
        int m = 0;
        int tt = 0;
        int seconds = (int) (diff/1000); 
        h = seconds/(60*60);
        if(h > 0){
            seconds -= h*60*60;
        }
        m = seconds/(60);
        if(m > 0){
            seconds -= m*60;
        }
        
       // ClockLabel dateLable = new ClockLabel("date");
            
            
            
        ClockLabel timeLable = new ClockLabel("time",h,m,seconds); 
       // ClockLabel dayLable = new ClockLabel("day");
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("Digital Clock");
    f.setSize(300,150);
   // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(1, 1));
 
   // f.add(dateLable);
    f.add(timeLable);
    //f.add(dayLable);
 
    f.getContentPane().setBackground(Color.black);
 
    f.setVisible(true);
            
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
        btnReview = new javax.swing.JButton();
        btnAnouncement1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Teaching Assistant");

        btnStartTAHours.setBackground(new java.awt.Color(51, 153, 255));
        btnStartTAHours.setForeground(new java.awt.Color(255, 255, 255));
        btnStartTAHours.setText("Start TA hours");
        btnStartTAHours.setToolTipText("");
        btnStartTAHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartTAHoursActionPerformed(evt);
            }
        });

        btnEndTAHours.setBackground(new java.awt.Color(51, 153, 255));
        btnEndTAHours.setForeground(new java.awt.Color(255, 255, 255));
        btnEndTAHours.setText("End TA hours");
        btnEndTAHours.setToolTipText("");
        btnEndTAHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndTAHoursActionPerformed(evt);
            }
        });

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

        btnReview.setBackground(new java.awt.Color(51, 153, 255));
        btnReview.setForeground(new java.awt.Color(255, 255, 255));
        btnReview.setText("Assignment Review");
        btnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewActionPerformed(evt);
            }
        });

        btnAnouncement1.setBackground(new java.awt.Color(51, 153, 255));
        btnAnouncement1.setForeground(new java.awt.Color(255, 255, 255));
        btnAnouncement1.setText("Working Hours");
        btnAnouncement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnouncement1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnStartTAHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEndTAHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAnouncement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAnouncement1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartTAHours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEndTAHours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnouncement1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnouncement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTIme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReview))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblTAHours.getModel();
        model.setRowCount(0);
        TARole role = (TARole) userAccount.getRole();
        Object[] row = new Object[6];
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
            row[5] = r;
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
        
       // ClockLabel dateLable = new ClockLabel("date");
    ClockLabel timeLable = new ClockLabel("time",0,0,0); 
    //ClockLabel dayLable = new ClockLabel("day");
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("Digital Clock");
    f.setSize(300,150);
    //f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(1, 1));
 
  //  f.add(dateLable);
    f.add(timeLable);
   // f.add(dayLable);
 
    f.getContentPane().setBackground(Color.black);
 
    f.setVisible(true);
        
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
            TAhrs.setStatus("Submitted");
            btnStartTAHours.setEnabled(true);
            btnEndTAHours.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(TAWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        populateTable();
    }//GEN-LAST:event_btnEndTAHoursActionPerformed

    private void btnAnouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnouncementActionPerformed
        // TODO add your handling code here:
  if(!(program instanceof Program)){
            JOptionPane.showMessageDialog(null, "Please add program");
            return;
        }
        if(!(course instanceof Courses)){
            JOptionPane.showMessageDialog(null, "Please add course");
            return;
        }
        
        AnouncementJPanel JPanel = new AnouncementJPanel(userProcessContainer, program, userAccount, organization, course);
        userProcessContainer.add("AnouncementJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAnouncementActionPerformed

    private void btnTImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTImeActionPerformed
        // TODO add your handling code here:
          if(!(program instanceof Program)){
            JOptionPane.showMessageDialog(null, "Please add program");
            return;
        }
        if(!(course instanceof Courses)){
            JOptionPane.showMessageDialog(null, "Please add course");
            return;
        }
        
        TimeSlotJPanel JPanel = new TimeSlotJPanel(userProcessContainer, program, userAccount, organization, course);
        userProcessContainer.add("TimeSlotJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTImeActionPerformed

    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewActionPerformed
        // TODO add your handling code here:
          if(!(program instanceof Program)){
            JOptionPane.showMessageDialog(null, "Please add program");
            return;
        }
        if(!(course instanceof Courses)){
            JOptionPane.showMessageDialog(null, "Please add course");
            return;
        }
        
         ReviewJPanel  JPanel = new ReviewJPanel(userProcessContainer, program, userAccount, organization, course);
        userProcessContainer.add("ReviewJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnReviewActionPerformed

    private void btnAnouncement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnouncement1ActionPerformed
        // TODO add your handling code here:
        
        if(!(program instanceof Program)){
            JOptionPane.showMessageDialog(null, "Please add program");
            return;
        }
        if(!(course instanceof Courses)){
            JOptionPane.showMessageDialog(null, "Please add course");
            return;
        }
        
        
        WorkingHoursJPanel  JPanel = new WorkingHoursJPanel(userProcessContainer, program, userAccount, organization, course);
        userProcessContainer.add("ReviewJPanel", JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnAnouncement1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnouncement;
    private javax.swing.JButton btnAnouncement1;
    private javax.swing.JButton btnEndTAHours;
    private javax.swing.JButton btnReview;
    private javax.swing.JButton btnStartTAHours;
    private javax.swing.JButton btnTIme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFeeds;
    private javax.swing.JTable tblTAHours;
    // End of variables declaration//GEN-END:variables
}
