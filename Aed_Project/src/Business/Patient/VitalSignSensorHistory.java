/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author vega
 */

   

import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class VitalSignSensorHistory {
  private ArrayList<VitalSignSensor> history;
 private int sensorID; 
 private static int count=0;
 private RandomDataGenerator rdg;
 
    public VitalSignSensorHistory() {
        count++; 
        sensorID=count;
        history = new ArrayList<>();
     
    }

    public ArrayList<VitalSignSensor> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSignSensor> history) {
        this.history = history;
    }

    public int getSensorID() {
        return sensorID;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }
    

  


    public VitalSignSensor createAndAddVitalSign() {
        VitalSignSensor vitalSign = new VitalSignSensor();
        history.add(vitalSign);
        return vitalSign;
    }

    public void deleteVitalSign(VitalSignSensor vitalSign) {
        history.remove(vitalSign);
    }  
}


