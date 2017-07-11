/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Locality;

import Business.House.House;
import Business.House.HouseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author vega
 */
public abstract class Locality extends Organization{
   private LocalityType localityType;
    private OrganizationDirectory organizationDirectory;
    private HouseDirectory houseDirectory;

  
    
    
    public Locality(String name, LocalityType type) {
        super(name);
        this.localityType = type;
        organizationDirectory = new OrganizationDirectory();
        houseDirectory = new HouseDirectory();
    }
        

    public enum LocalityType{
        RuralLocality("Rural"),
        SuburbanLocality("Suburban"),
        UrbanLocality("Urban");
        
        private String value;

        private LocalityType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public LocalityType getLocalityType() {
        return localityType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
     public HouseDirectory getHouseDirectory() {
        return houseDirectory;
    } 
 
}
