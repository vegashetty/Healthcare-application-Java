/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HealthCareOrgAdmin;

import Business.Locality.Locality;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.VitalSignSensor;
import Business.Patient.VitalSignSensorHistory;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.Utils.NumberVerifier;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Random;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vega
 */
public class VitalSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignJPanel
     */
    private Patient patient;
    private JPanel userProcessContainer;
    private Locality locality;
    private Person person;

    public VitalSignJPanel(JPanel upc, Person person) {
        initComponents();
        this.userProcessContainer = upc;
        this.person = person;
        this.locality = locality;
       // addVerifiers();
        populateVitalSignDetails();
    }

   /* private void addVerifiers() {
        InputVerifier integerVerifier = new NumberVerifier();
        respiratoryRateJTextField.setInputVerifier(integerVerifier);
        heartRateJTextField.setInputVerifier(integerVerifier);
        bloodPressureJTextField.setInputVerifier(integerVerifier);
        weightJTextField.setInputVerifier(integerVerifier);
    }
   */
     private void populateVitalSignDetails() {
          Random aRandom =new Random();
 Random aRandom1 =new Random();
  Random aRandom2 =new Random();
   Random aRandom3 =new Random();
 int randomNumber =  (int)aRandom.nextInt(45 - 5 ) + 5 ;  //100-200
  int randomNumber1 =  (int)aRandom1.nextInt(145 - 45) + 45; 
   int randomNumber2 =  (int)aRandom2.nextInt(140 - 70) + 70; 
    int randomNumber3 =  (int)aRandom3.nextInt(125 - 10 ) + 10 ; 
    
        respiratoryRateJTextField.setText(String.valueOf( randomNumber));
        heartRateJTextField.setText(String.valueOf(randomNumber1));
        bloodPressureJTextField.setText(String.valueOf(randomNumber2));
        weightJTextField.setText(String.valueOf(randomNumber3));
        // System.out.println("we" + patient.getRdg());
    }
  private String VitalSignStatus(int patientAge, VitalSignSensor vitalSign) {
        String vitalSignStatus = "Normal";

        int respirationRate = vitalSign.getRespiratoryRate();
        int heartRate = vitalSign.getHeartRate();
        int bloodPressure = vitalSign.getBloodPressure();
        float weight = vitalSign.getWeight();

        /*Toddler*/
        if (patientAge >= 1 && patientAge <= 3) {
            if ((respirationRate < 20 || respirationRate > 30) /*Respiration Rate*/
                    || (heartRate < 80 || heartRate > 130) /*Heart Rate*/
                    || (bloodPressure < 80 || bloodPressure > 110) /*Blood Pressure*/
                    || (weight < 22 || weight > 31)) /*Weight*/ {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Preschooler*/
        if (patientAge >= 4 && patientAge <= 5) {
            if ((respirationRate < 30 || respirationRate > 40)
                    || (heartRate < 80 || heartRate > 120)
                    || (bloodPressure < 80 || bloodPressure > 110)
                    || (weight < 31 || weight > 40)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*School Age*/
        if (patientAge >= 6 && patientAge <= 12) {
            if ((respirationRate < 30 || respirationRate > 40)
                    || (heartRate < 85 || heartRate > 115)
                    || (bloodPressure < 80 || bloodPressure > 120)
                    || (weight < 41 || weight > 92)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Adolescent*/
        if (patientAge >= 13) {
            if ((respirationRate < 12 || respirationRate > 20)
                    || (heartRate < 55 || heartRate > 105)
                    || (bloodPressure < 110 || bloodPressure > 120)
                    || (weight < 110)) {
                vitalSignStatus = "Abnormal";
            }
        }
        
         
          return vitalSignStatus;
    
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bloodPressureJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 253));

        saveJButton.setBackground(new java.awt.Color(51, 51, 255));
        saveJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        saveJButton.setForeground(new java.awt.Color(255, 255, 255));
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter Vital Sign History");

        backJButton1.setBackground(new java.awt.Color(51, 51, 255));
        backJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(255, 255, 255));
        backJButton1.setText("<<Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Respiratory rate");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Heart rate");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Systolic blood pressure");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Weight in pounds");

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel9.setText("National Pediatric Pneumonia Healthcare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respiratoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(539, 539, 539)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(respiratoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
     
            //respiratoryRateJTextField.setText(String.valueOf(patient.getRdg().generateAQI()));

            int respiratoryRate = Integer.parseInt(respiratoryRateJTextField.getText());
            int heartRate = Integer.parseInt(heartRateJTextField.getText());
            int bloodPressure = Integer.parseInt(bloodPressureJTextField.getText());
            int weight = Integer.parseInt(weightJTextField.getText());
            System.out.println("e" + person.getPatient().getVitalSignSensorList());

            for(VitalSignSensorHistory vssh : person.getPatient().getVitalSignSensorList().getList())
            {VitalSignSensor vitalSign = vssh.createAndAddVitalSign() ;
            
            vitalSign.setRespiratoryRate(respiratoryRate);
            vitalSign.setHeartRate(heartRate);
            vitalSign.setBloodPressure(bloodPressure);
            vitalSign.setWeight(weight);
            vitalSign.setStatus(VitalSignStatus(person.getPatient().getAge(), vitalSign));
                System.out.println("jo");
            /*Set current date and time as TimeStamp*/
            vitalSign.setTimestamp(new Date());
            }
            JOptionPane.showMessageDialog(this, "Vital signs added!!", "Update", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            respiratoryRateJTextField.setEnabled(false);
            heartRateJTextField.setEnabled(false);
            bloodPressureJTextField.setEnabled(false);
            weightJTextField.setEnabled(false);
       /*catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter correct values", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_saveJButtonActionPerformed
private void clearFields() {
        respiratoryRateJTextField.setText("");
        heartRateJTextField.setText("");
        bloodPressureJTextField.setText("");
        weightJTextField.setText("");
    }

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
