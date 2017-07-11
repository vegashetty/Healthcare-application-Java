/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Locality.Locality;
import Business.Role.Role;
import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class UserAccDirectory {
  private ArrayList<UserAccount> userAccountList;

    public UserAccDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
     public boolean checkUsernameUnique(Ecosystem system, String userName){
      boolean flag = false;
      flag = system.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
      if (flag == false) {
          A:
          for (State state: system.getStateList()) {
              for (Locality locality : state.getLocalityDirectory().getLocalityList()) {
                  flag = locality.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                  if (flag == true) {
                      break A;
                  }
              }
          }
      }
    
              /*for (State  : state.ge) {
                  for (Enterprise enterprise : cityNet.getEnterpriseDirectory().getEnterpriseList()) {
                      flag = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                      if (flag == true) {
                          break A;
                      }
                  }
              }*/
          
      
      else{
          return flag;
      }
      return flag;
  }
}
