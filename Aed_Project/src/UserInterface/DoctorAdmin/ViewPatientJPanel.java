/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorAdmin;

import Business.Patient.Patient;
import Business.Patient.VitalSignSensor;
import Business.Patient.VitalSignSensorHistory;
import Business.Person.Person;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
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
public class ViewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientJPanel
     */
     private Patient patient;
    private JPanel userProcessContainer;
   // private Locality locality;
    private Person person;
    ///private VitalSignSensor vssh;
    

    public ViewPatientJPanel(JPanel upc, Patient patient) {
        initComponents();
        this.userProcessContainer = upc;
        this.person = person;
        this.patient = patient;
        //this.locality = locality;
        //this.vssh = vssh;
        populateVitalSignTable();
        populateVitalSignDetails();
    }
    private void populateVitalSignTable() {

        DefaultTableModel model = (DefaultTableModel) vitalsjTable.getModel();
        model.setRowCount(0);
        
              for(VitalSignSensorHistory vssh : patient.getVitalSignSensorList().getList())
           {ArrayList<VitalSignSensor> vitalSignList = vssh.getHistory();

           
            for (VitalSignSensor vitalSign : vssh.getHistory()) {
                Object[] row = new Object[5];
                row[0] = vitalSign.getRespiratoryRate();
                row[2] = vitalSign.getTimestamp();
                row[1] = vitalSign.getBloodPressure();
                
                row[3] = vitalSign.getStatus();
                //vitalSign.setStatus(String.valueOf(VitalSignStatus(patientAge, vitalSign)));
                model.addRow(row);
            }
            }
        
    }
    private void populateVitalSignDetails() {
       pidjTextField.setText(patient.getPatientID());
        agejTextField.setText(String.valueOf(patient.getAge()));
       // bloodPressureJTextField.setText(String.valueOf(vitalSign.getBloodPressure()));
       // weightJTextField.setText(String.valueOf(vitalSign.getWeight()));
    }
    
    private void createChart()
    {
        DefaultCategoryDataset vitalSignDataset=new DefaultCategoryDataset();
       // int selectedRow = vitalsjTable.getSelectedRow();
//        VitalSignSensor vs = (VitalSignSensor) vitalsjTable.getValueAt(selectedRow, 0);
        //Patient patient= person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
      
              for(VitalSignSensorHistory vssh : patient.getVitalSignSensorList().getList())
            {ArrayList<VitalSignSensor> vitalSignList = vssh.getHistory();

       
        /*At least 2 vital sign records needed to show chart */
        if (vitalSignList.isEmpty() || vitalSignList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No vital signs or only one vital sign found. At least 2 vital sign records needed to show chart!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (VitalSignSensor vitalSign : vitalSignList) {
            vitalSignDataset.addValue(vitalSign.getRespiratoryRate(),"RR", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getHeartRate(),"HR", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getBloodPressure(),"BP", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getWeight(),"WT", vitalSign.getTimestamp());
        }
        
        JFreeChart vitalSignChart= ChartFactory.createBarChart3D("Vital Sign Chart", "Time Stamp", "Rate", vitalSignDataset, PlotOrientation.VERTICAL, true, false, false);
        vitalSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = vitalSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);    
        
       org.jfree.chart.axis.CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
       // ChartFrame chartFrame = new ChartFrame("Chart", vitalSignChart);
        //chartjPanel.add("",vitalSignChart);
        //chartFrame.setVisible(true);
        //chartFrame.setSize(500, 500);
        JPanel chartPanel = new ChartPanel(vitalSignChart);
    chartPanel.setSize(chartjPanel.getSize());
    chartjPanel.add(chartPanel);
    chartjPanel.getParent().validate();
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

        agejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pidjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chartjPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        viewChartjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalsjTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(231, 231, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(agejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 117, -1));

        jLabel2.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel2.setText("Patient Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Patient ID :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        add(pidjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 117, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Vital Signs :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Age");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        javax.swing.GroupLayout chartjPanelLayout = new javax.swing.GroupLayout(chartjPanel);
        chartjPanel.setLayout(chartjPanelLayout);
        chartjPanelLayout.setHorizontalGroup(
            chartjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        chartjPanelLayout.setVerticalGroup(
            chartjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        add(chartjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, 260));

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 255, -1));

        jLabel9.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel9.setText("National Pediatric Pneumonia Healthcare");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        viewChartjButton.setBackground(new java.awt.Color(51, 51, 255));
        viewChartjButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewChartjButton.setForeground(new java.awt.Color(255, 255, 255));
        viewChartjButton.setText("View Visual Chart");
        viewChartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChartjButtonActionPerformed(evt);
            }
        });
        add(viewChartjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 251, 40));

        backjButton.setBackground(new java.awt.Color(51, 51, 255));
        backjButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(255, 255, 255));
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, 40));

        vitalsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Respiratory rate", "Blood Pressure", "TRacked on Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(vitalsjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, 107));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);     // TODO add your handling code here:
    }//GEN-LAST:event_backjButtonActionPerformed

    private void viewChartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChartjButtonActionPerformed
      int selectedRow = vitalsjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a patient from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        createChart();
       
           // TODO add your handling code here:
    }//GEN-LAST:event_viewChartjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agejTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JPanel chartjPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pidjTextField;
    private javax.swing.JButton viewChartjButton;
    private javax.swing.JTable vitalsjTable;
    // End of variables declaration//GEN-END:variables
}
