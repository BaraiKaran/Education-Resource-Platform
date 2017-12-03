/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CollegeAdmin;

import Business.College.Program;
import Business.Courses.Courses;
import Interface.ProfessorRole.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.CollegeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author aakas
 */
public class CollegeAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    CollegeOrganization org;
    
    public CollegeAdminWorkAreaJPanel(JPanel userProcessContainer, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = (CollegeOrganization)org;
        plotgraph();
    }

    
    public void plotgraph() {

        int prgcount = 0;
        int courses = 0;
        int usrcount = 0;
        
        for(Program pg : org.getPD().getDirectory()){
            prgcount++;
            for(Courses cr : pg.getCourses().getCourseList()){
                if(cr.getApprovalStatus().equals("Approved"))
                    courses++;
            }
        }

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();

        dcd.setValue(prgcount, "Program", "No. of Programs");
        dcd.setValue(courses, "Courses", "No. of Courses");
        //dcd.setValue(usrcount, "Users", "No. of User Accounts");

        JFreeChart jchart = ChartFactory.createBarChart3D("College Statistics", "Entities", "Numbers", dcd, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartp = new ChartPanel(jchart, true);
        //  chartp.setDomainZoomable(true);
        chartp.setVisible(true);
        barchart.removeAll();
        barchart.setLayout(new java.awt.BorderLayout());
        barchart.add(chartp, BorderLayout.CENTER);

        barchart.validate();
       /* DefaultPieDataset pcd = new DefaultPieDataset();
        int cc = 0;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                cc++;
            }
            pcd.setValue(org.getName(), cc);
            cc = 0;
        }

        //pcd.setValue("COE", 2);
        //pcd.setValue("CCIS", 4);
        JFreeChart jcrt = ChartFactory.createPieChart("College employees", pcd, true, true, false);
        plot.setRangeGridlinePaint(Color.BLACK);
        ChartPanel chrtp = new ChartPanel(jcrt, true);
        //   chrtp.setDomainZoomable(true);
        chrtp.setVisible(true);
        chrtp.setPreferredSize(new Dimension(200, 200));
        piechart.removeAll();
        piechart.setLayout(new java.awt.BorderLayout());
        piechart.add(chrtp, BorderLayout.CENTER);
        piechart.validate();
        */
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
        piechart = new javax.swing.JPanel();
        barchart = new javax.swing.JPanel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome College Administration");

        manageOrganizationJButton.setBackground(new java.awt.Color(51, 153, 255));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout piechartLayout = new javax.swing.GroupLayout(piechart);
        piechart.setLayout(piechartLayout);
        piechartLayout.setHorizontalGroup(
            piechartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        piechartLayout.setVerticalGroup(
            piechartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barchartLayout = new javax.swing.GroupLayout(barchart);
        barchart.setLayout(barchartLayout);
        barchartLayout.setHorizontalGroup(
            barchartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barchartLayout.setVerticalGroup(
            barchartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageOrganizationJButton)
                        .addGap(39, 39, 39)
                        .addComponent(piechart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(barchart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(piechart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(barchart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageProgramJPanel panel = new ManageProgramJPanel(userProcessContainer, org);
        userProcessContainer.add("ManageCourseJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barchart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JPanel piechart;
    // End of variables declaration//GEN-END:variables
}
