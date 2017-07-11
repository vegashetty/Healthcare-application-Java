/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vega
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }

    public Person createAndAddPerson(String name,  int number,String gender,String dateOfBirth) {
        Person person = new Person();
        person.setPersonName(name);
       
        person.setGender(gender);
        person.setNumber(number);
        person.setDob(dateOfBirth);
        personDirectory.add(person);
        return person;
    }

    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}
