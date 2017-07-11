/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Patient.Patient;
import Business.Patient.VitalSignSensor;
import Business.Patient.VitalSignSensorHistory;
import Business.Person.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalsjTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        agejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pidjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backjButton.setBackground(new java.awt.Color(51, 51, 255));
        backjButton.setForeground(new java.awt.Color(255, 255, 255));
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 595, -1, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 431, -1, 107));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 324, -1, -1));
        add(agejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 320, 117, -1));

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel1.setText("Patient Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Patient ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        add(pidjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 257, 117, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Vital Signs :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 431, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 6, 255, -1));

        jLabel9.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel9.setText("National Pediatric Pneumonia Healthcare");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 125, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);     // TODO add your handling code here:
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agejTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pidjTextField;
    private javax.swing.JTable vitalsjTable;
    // End of variables declaration//GEN-END:variables
}
