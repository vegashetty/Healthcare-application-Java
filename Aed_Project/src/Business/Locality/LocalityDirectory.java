/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Locality;

import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class LocalityDirectory {
    private ArrayList<Locality> localityList;

    public LocalityDirectory() {
        localityList = new ArrayList<>();
    }

    public ArrayList<Locality> getLocalityList() {
        return localityList;
    }
    
    public Locality createAndAddLocality(String name, Locality.LocalityType type){
        Locality locality = null;
        if (type == Locality.LocalityType.RuralLocality){
            locality = new RuralLocality(name);
            localityList.add(locality);
        }
        else if (type == Locality.LocalityType.SuburbanLocality){
            locality = new SuburbanLocality(name);
            localityList.add(locality);
        }
        else if (type == Locality.LocalityType.UrbanLocality){
            locality = new UrbanLocality(name);
            localityList.add(locality);
        }
        return locality;
    }
}
