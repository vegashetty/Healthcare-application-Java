/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;

import Business.Employee.Employee;
import Business.Locality.Locality;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdministerVaccineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vega
 */
public class NurseWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaJpanel
     */
    private JPanel userProcessContainer;
   
    private UserAccount userAccount;
    private NurseOrganization nurseOrganization;
    private Locality l ;
     int curedCount = 0;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public NurseWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, Organization organization, Locality l ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
       this.l = l;
        this.nurseOrganization = (NurseOrganization)organization;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
       /* Organization org = null;
       for (Organization organization : l.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NurseOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
               for(UserAccount u : org.getUserAccountDirectory().getUserAccountList())
               {*/
                   for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
    
                 AdministerVaccineRequest adwr = (AdministerVaccineRequest)request;
                   
                   
            Object[] row = new Object[5];
      row[0] = adwr;
            row[1] = adwr.getPatient();
       
          //  row[2] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getMessage();
            
            model.addRow(row);
       // }
    }
      //  }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        messagejTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Patient", "Doctor", "Message from Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 496, 96));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel10.setText("National Pediatric Pneumonia Healthcare");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel1.setText("Nurse Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 302, -1, -1));

        submitJButton.setBackground(new java.awt.Color(51, 51, 255));
        submitJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));
        add(messagejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/NurseRole/download.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 478, -1));

        jLabel3.setText("Result");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
AdministerVaccineRequest selectedPatient;
        int selectedRow= workRequestJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(this,"Select a row","warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            selectedPatient = (AdministerVaccineRequest)workRequestJTable.getValueAt(selectedRow,0);
        }
        
       
       
       /* 
        if(selectedPatient.getStatus() !=null)
        {
           // JOptionPane.showMessageDialog(this, "Result sent already.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }    */  
        for(WorkRequest request1 : userAccount.getWorkQueue().getWorkRequestList()){

            AdministerVaccineRequest apwr = (AdministerVaccineRequest)request1;

            apwr.setStatus(messagejTextField1.getText());
          for(Employee e : nurseOrganization.getEmployeeDirectory().getEmployeeList())
          {
          if(e.getPatientCount()== 0)
       {
        curedCount++;
       apwr.setCuredCount(curedCount);
       e.setPatientCount(curedCount);
           System.out.println("uy" + apwr.getCuredCount());}
       else
       {
         apwr.setCuredCount(apwr.getCuredCount() + 1);}
        userAccount.getEmployee().setPatientCount(e.getPatientCount() + 1);
        messagejTextField1.setText("");
        }
        }
        
        
       
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messagejTextField1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
