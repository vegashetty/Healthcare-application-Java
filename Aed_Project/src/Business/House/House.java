/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.House;

import Business.Person.PersonDirectory;

/**
 *
 * @author vega
 */
public class House {
   private String street;
    private int zip;
    private String hid; 
    private PersonDirectory personDirectory;
    private static int count = 0;

   public House()
{
      
        count++;
         hid = (String.valueOf("H"+ count));

this.personDirectory = new PersonDirectory();
}
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }
     @Override
    public String toString()
    {
        return this.hid;
    }
    
}
