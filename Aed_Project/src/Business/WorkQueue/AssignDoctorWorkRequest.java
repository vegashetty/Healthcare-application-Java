/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author vega
 */
public class AssignDoctorWorkRequest extends WorkRequest {
   private String date;
  private String vitalStatus;
  private String assign; 
private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVitalStatus() {
        return vitalStatus;
    }

    public void setVitalStatus(String vitalStatus) {
        this.vitalStatus = vitalStatus;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    } 
}
