/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Locality.Locality;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class Ecosystem extends Organization{
     private static Ecosystem business;
    private ArrayList<State> stateList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    private Ecosystem() {
        super(null);
        stateList = new ArrayList<>();
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }

    public State addState() {
       // String state[]={"mn"};
        State state = new State();
        stateList.add(state);
        return state;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
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

    

