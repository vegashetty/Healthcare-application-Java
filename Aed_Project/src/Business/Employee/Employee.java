/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Comparator;

/**
 *
 * @author vega
 */
public class Employee implements Comparator<Employee>{
   private String name;
    private int id;
    private static int count = 1;
    private String email;
    private int pNumber;
    private int patientCount;

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    } 

   

    @Override
    public int compare(Employee o1, Employee o2) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int patientCuredCount1=o1.patientCount;
        int  patientCuredCount2 =o2.patientCount;
        
        
        if(patientCuredCount1 >patientCuredCount2)
        {
            return -1;
        }
        else if(patientCuredCount1 < patientCuredCount2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
}
