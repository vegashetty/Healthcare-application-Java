/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author vega
 */
public class ConfigureSystem {
   
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        for(int i  = 0 ; i <= 9 ; i ++)
        {
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Application Admin","",i);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        }
        return system;
        
    }
    


}
