/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CaregiverAdmin;

import Business.Employee.Employee;
import Business.House.House;
import Business.Locality.Locality;
import Business.Organization.CaregiverOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.VitalSignSensor;
import Business.Patient.VitalSignSensorHistory;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdmitPatientWorkRequest;
import Business.WorkQueue.MonitorVitalsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vega
 */
public class CaregiverWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaregiverWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Locality locality;
    private UserAccount userAccount;
    private CaregiverOrganization caregiverOrganization;
    
    /**
     * Creates new form SelectDonorJPanel
     */
    public CaregiverWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Locality locality) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.locality = locality;
        this.caregiverOrganization = (CaregiverOrganization)organization;
        populateHospitalComboBox();
        populateTable();
    }
    public void populateHospitalComboBox(){
        hospitaljComboBox.removeAllItems();
        
         Organization org = null;
        for (Organization organization : locality.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof HospitalOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
 
    
           for (Employee e : org.getEmployeeDirectory().getEmployeeList())
           {
            hospitaljComboBox.addItem(e);
        }
    }
        
    
    }
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)patientjTable.getModel();
        
        model.setRowCount(0);
       /*  Organization org = null;
        for (Organization organization : locality.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CaregiverOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
  
                    for(UserAccount u : org.getUserAccountDirectory().getUserAccountList())
                    {*/
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
                    
                  AdmitPatientWorkRequest apwr = (AdmitPatientWorkRequest)request;
                
           
            Object[] row = new Object[4];
            row[0] = apwr;
            row[2] = apwr.getPatient();
            
      
            row[1] = apwr.getPatient().getDate();
           row[3] = apwr.getStatus();
         
            
            model.addRow(row);
        
        
  //  }
      //    }
       // }
   // }
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

        jButton2 = new javax.swing.JButton();
        admitPatientjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientjTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hospitaljComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statusjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hospitalStatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(231, 231, 253));

        admitPatientjButton.setBackground(new java.awt.Color(51, 51, 255));
        admitPatientjButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        admitPatientjButton.setForeground(new java.awt.Color(255, 255, 255));
        admitPatientjButton.setText("Assign Hospital");
        admitPatientjButton.setToolTipText("");
        admitPatientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitPatientjButtonActionPerformed(evt);
            }
        });

        patientjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Tracked Date", "Patient ID", "Message From Health Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientjTable);
        if (patientjTable.getColumnModel().getColumnCount() > 0) {
            patientjTable.getColumnModel().getColumn(0).setMinWidth(0);
            patientjTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            patientjTable.getColumnModel().getColumn(0).setMaxWidth(0);
            patientjTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("VIEW ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel2.setText("Welcome Caregiver");

        hospitaljComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Choose Hospital :");

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel9.setText("National Pediatric Pneumonia Healthcare");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Provide status to health organization");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Provide status to hospital");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText(" View patient from records");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CaregiverAdmin/resize.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(265, 265, 265)
                                        .addComponent(hospitaljComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(statusjTextField)
                                                .addGap(8, 8, 8))
                                            .addComponent(hospitalStatus)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel9))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(278, 278, 278)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(admitPatientjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hospitaljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hospitalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(admitPatientjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void admitPatientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitPatientjButtonActionPerformed
 int selectedRow = patientjTable.getSelectedRow();
 AdmitPatientWorkRequest selectedPatient;
        
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(this,"Select a row","warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            selectedPatient = (AdmitPatientWorkRequest)patientjTable.getValueAt(selectedRow,0);
        }
        
       
       
        
        if(selectedPatient.getMessage()!=null)
        {
            JOptionPane.showMessageDialog(this, "Assigned already.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Employee e = (Employee)hospitaljComboBox.getSelectedItem();
        //for (UserAccount ua : egetEmployeeDirectory().getEmployeeList())

        //e.

       
        Patient selectedPerson;

        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(this,"Select a row","warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            selectedPerson = (Patient)patientjTable.getValueAt(selectedRow,2);
            //System.out.println("er");
        }
        MonitorVitalsWorkRequest request = new MonitorVitalsWorkRequest();
        request.setPatient(selectedPerson);

        Organization org = null;
        for (Organization organization : locality.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof HospitalOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
          
                    for(UserAccount u : org.getUserAccountDirectory().getUserAccountList())
                    {
                        if(u.getEmployee() == e)
                        {
                            WorkRequest req = request;
                                       

                            org.getWorkQueue().getWorkRequestList().add(req);
                            
                            u.getWorkQueue().getWorkRequestList().add(req);

                            request.setReceiver(userAccount);

                            request.setSender(u);
                            request.setStatus(hospitalStatus.getText());
                         hospitalStatus.setText("");
DefaultTableModel model = (DefaultTableModel) patientjTable.getModel();
 model.removeRow(selectedRow);
 
                        }
                    
        }
                }

 for(WorkRequest request1 : userAccount.getWorkQueue().getWorkRequestList()){
                    
                  AdmitPatientWorkRequest apwr = (AdmitPatientWorkRequest)request1;
                
          
         
        apwr.setMessage(statusjTextField.getText());
    //    populateTable();
      statusjTextField.setText("");
        JOptionPane.showMessageDialog(this,"Hospital assigned to Patient","Information",JOptionPane.INFORMATION_MESSAGE);

 }
// TODO add your handling code here:
    }//GEN-LAST:event_admitPatientjButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int selectedRow = patientjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Patient p = (Patient)patientjTable.getValueAt(selectedRow, 2);
        ViewPatientJPanel vuvsJPanel = new ViewPatientJPanel(userProcessContainer, p);
        userProcessContainer.add("vuvsJPanel", vuvsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admitPatientjButton;
    private javax.swing.JTextField hospitalStatus;
    private javax.swing.JComboBox hospitaljComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientjTable;
    private javax.swing.JTextField statusjTextField;
    // End of variables declaration//GEN-END:variables
}
