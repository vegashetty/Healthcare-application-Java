/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class VitalSignSensorList {
    
  private ArrayList<VitalSignSensorHistory> list;
  
 public VitalSignSensorList()
 { list = new ArrayList<>(); 
 } 

    public ArrayList<VitalSignSensorHistory> getList() {
        return list;
    }

    public void setList(ArrayList<VitalSignSensorHistory> list) {
        this.list = list;
    }
 
 
 public VitalSignSensorHistory createAndAddSensor()
 { VitalSignSensorHistory sensor = new VitalSignSensorHistory(); 
   //  for (int i = 0; i < number; i++) 
 { 
 
 
 list.add(sensor); 
 }
return sensor;
     
 } 

}
