/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TARole;

import Business.Assignment.Assignment;
import Business.AssignmentSubmission.Submission;
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

/**
 *
 * @author krunal
 */
public class AReviewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AReviewJPanel
     */
    
    private JPanel userProcessContainer;
    private CollegeOrganization organization;
    private UserAccount userAccount;
    private Program program;
    private Courses course;
    private TimeSlots timeslot;
    private Assignment assignment;
    private Submission submission;
    
    
    public AReviewJPanel() {
        initComponents();
    }

    public AReviewJPanel(JPanel userProcessContainer, Program program, UserAccount userAccount, CollegeOrganization organization, Courses course, TimeSlots timeslot,Assignment assignment) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = (CollegeOrganization) organization;
        this.userAccount = userAccount;
        this.program = program;
        this.course = course;
        this.timeslot = timeslot;
        
        this.assignment = assignment;
        for(Submission sb : this.assignment.getSubmissionDirectory().getSubmission()){
            if(sb.getStudent().getId() == this.timeslot.getStudent().getId()){
                this.submission = sb;
                System.out.println(sb.getPath());
            }
        }
        
        populatedata();
        
    }

    
    public void populatedata(){
        lblSb.setText(submission.getPath());
        lbAs.setText(assignment.getTitle());
        lbSt.setText(submission.getStudent().getEmployee().getName());
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
        jLabel1 = new javax.swing.JLabel();
        lblSb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbAs = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbSt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMarks = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Assignment Review");

        jLabel1.setText("Submission File : ");

        lblSb.setText("jLabel3");

        jLabel4.setText("Assignment :");

        lbAs.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Student :");

        lbSt.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Marks :");

        txtMarks.setBackground(new java.awt.Color(240, 240, 240));

        btnSubmit.setBackground(new java.awt.Color(51, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbSt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(lbAs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMarks)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblSb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbSt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        if(txtMarks.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter marks");
            return;
        }
        try{
        submission.setMarks(Integer.parseInt(txtMarks.getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter only interger values");
        }
        
        System.out.println(submission.getMarks());
    }//GEN-LAST:event_btnSubmitActionPerformed

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
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbAs;
    private javax.swing.JLabel lbSt;
    private javax.swing.JLabel lblSb;
    private javax.swing.JTextField txtMarks;
    // End of variables declaration//GEN-END:variables
}
