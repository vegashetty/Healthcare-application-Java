/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Locality.LocalityDirectory;

/**
 *
 * @author vega
 */
public class State {
   private String stateName;
    private LocalityDirectory localityDirectory;

    public State() {
        localityDirectory = new LocalityDirectory();
    }

    public LocalityDirectory getLocalityDirectory() {
        return localityDirectory;
    }

   

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    

    @Override
    public String toString() {
        return stateName;
    } 
}
