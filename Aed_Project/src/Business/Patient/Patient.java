/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vega
 */
public class Patient {
  private String patientID;
  private int age;
    private Date date;
    private String parentName;
    private String pastHistory;
   private VitalSignSensorHistory vitalSignSensorHistory;
    private RandomDataGenerator rdg;
    private VitalSignSensorList vitalSignSensorList;
    private static int count = 0;
private String insurance;

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
    public Patient() {
      
        count++;
         patientID = (String.valueOf("P"+count));
           this.rdg = new RandomDataGenerator();
    this.vitalSignSensorList = new VitalSignSensorList();
    }

    public String getPatientID() {
        return patientID;
    }
  public RandomDataGenerator getRdg() {
        return rdg;
    }

    public Date getDate() {
        return date;
    }

    public VitalSignSensorList getVitalSignSensorList() {
        return vitalSignSensorList;
    }

    public void setVitalSignSensorList(VitalSignSensorList vitalSignSensorList) {
        this.vitalSignSensorList = vitalSignSensorList;
    }
    

    public void setDate(Date date) {
        this.date = date;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

   

    public VitalSignSensorHistory getVitalSignSensorHistory() {
        return vitalSignSensorHistory;
    }

    public void setVitalSignSensorHistory(VitalSignSensorHistory vitalSignSensorHistory) {
        this.vitalSignSensorHistory = vitalSignSensorHistory;
    }

   

    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    } 
 
   
}
