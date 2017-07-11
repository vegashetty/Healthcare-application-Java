/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.House;

import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class HouseDirectory {
    private ArrayList<House> houseDirectory;

    public HouseDirectory() {
        houseDirectory = new ArrayList<>();
    }

    public ArrayList<House> getHouseDirectory() {
        return houseDirectory;
    }

     
   

    public House createAndAddHouse(String id) {
        House h = new House();
        h.setHid(id);
        houseDirectory.add(h);
        return h;
    }

    public void deleteHouse(House house) {
        houseDirectory.remove(house);
    }
    
    public ArrayList<House> searchHouse(String key)
    {
        ArrayList<House> searchHouseDirectory = new ArrayList();
        for(House h: houseDirectory)
        {
            if(h.getHid() == key)
            {
                
                    searchHouseDirectory.add(h);
                }
            }
        
        return searchHouseDirectory;
    }
    
 

}
