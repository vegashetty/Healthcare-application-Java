/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdminWorkArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Locality.Locality;
import Business.Organization.CaregiverOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdministerVaccineRequest;
import Business.WorkQueue.AdmitPatientWorkRequest;
import Business.WorkQueue.AssignDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author vega
 */
public class StatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StatisticsJPanel
     */
   private JPanel userProcessContainer;
    private State state;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public StatisticsJPanel(JPanel userProcessContainer, State state) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.state = state;

       // populateTable();
    }
     private void populateTable(){
          
          
             
    
        //DefaultTableModel model = (DefaultTableModel)mayorjTable.getModel();
        
       // model.setRowCount(0);
        
       
     
            Object[] row = new Object[5];
            
           
                for(Locality l : state.getLocalityDirectory().getLocalityList())
                {
            //row[0] = l.getLocalityType();
           // row[1] = l;
            
                row[0] = l;
                row[1] = l.getLocalityType();
               // row[2] = state.getStateName();
                //row[2] = l.getLocalityType();
            /* Organization org = null;
        for (Organization organization : l.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
          
                    for(Employee e : org.getEmployeeDirectory().getEmployeeList())
                    {
            
            row[2] = e.getPatientCount();
                    }
            
      }
                    
        
                
                               
             Organization org1 = null;
        for (Organization organization1 : l.getOrganizationDirectory().getOrganizationList()){
            if (organization1 instanceof NurseOrganization){
                org1 = organization1;
                break;
            }
        }
        if (org1!=null){
          
                    for(Employee e : org.getEmployeeDirectory().getEmployeeList())
                    {
            
            row[3] = e.getPatientCount();
                    }
             
           // System.out.println("p" +  adwr.getCuredCount());
         
      
                    }*/
        }
         //   model.addRow(row);
            
                }
            
     
     private void createChart()
    {
        DefaultCategoryDataset localityDataset=new DefaultCategoryDataset();
     

       
        /*At least 2 vital sign records needed to show chart */
        if (state.getLocalityDirectory().getLocalityList().isEmpty() || state.getLocalityDirectory().getLocalityList().size() == 1) {
            JOptionPane.showMessageDialog(this, " At least 2 localities records needed to show chart!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        
        
        
           for(Locality l : state.getLocalityDirectory().getLocalityList())
                {
          
             Organization org = null;
        for (Organization organization : l.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
          
                      if (org!=null){
          
                    for(Employee e : org.getEmployeeDirectory().getEmployeeList())
                    {
            
             e.getPatientCount();
           // apwr.getCount();
      
        localityDataset.addValue(e.getPatientCount(), "No of Cases", l.getLocalityType());
        
        
        
 
        
       // for (VitalSignSensor vitalSign : vitalSignList) {
           
        }
        
        JFreeChart vitalSignChart= ChartFactory.createBarChart3D("Statistics for Pneumonia by Locality", "Locality", "Cases Reported", localityDataset, PlotOrientation.VERTICAL, true, false, false);
        vitalSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = vitalSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);    
        
       org.jfree.chart.axis.CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
       JPanel chartPanel = new ChartPanel(vitalSignChart);
    chartPanel.setSize(chartjPanel.getSize());
    chartjPanel.add(chartPanel);
    chartjPanel.getParent().validate();
            
    }
          }
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

        chartjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chartjPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 231, 253));

        chartjButton.setText("View Visual Charts");
        chartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartjButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel5.setText("National Pediatric Pneumonia Healthcare");

        javax.swing.GroupLayout chartjPanelLayout = new javax.swing.GroupLayout(chartjPanel);
        chartjPanel.setLayout(chartjPanelLayout);
        chartjPanelLayout.setHorizontalGroup(
            chartjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        chartjPanelLayout.setVerticalGroup(
            chartjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("View Statistics for Localities");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(chartjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(chartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(chartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(chartjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(112, 112, 112))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartjButtonActionPerformed
       createChart(); // TODO add your handling code here:
    }//GEN-LAST:event_chartjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
      
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
                                                      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chartjButton;
    private javax.swing.JPanel chartjPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
