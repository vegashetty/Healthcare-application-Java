/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Locality;

import Business.House.House;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class SuburbanLocality extends Locality{

    public SuburbanLocality(String name) {
        super(name, LocalityType.SuburbanLocality);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;}

   
   
}
