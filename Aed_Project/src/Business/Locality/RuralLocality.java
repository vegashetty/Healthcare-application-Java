/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Locality;

import Business.House.House;
import Business.House.HouseDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class RuralLocality extends Locality{
    public RuralLocality(String name) {
        super(name, LocalityType.RuralLocality);

    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;}
  
   
}
