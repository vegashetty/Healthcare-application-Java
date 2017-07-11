/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.ConfigureSystem;

import Business.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author vega
 */
public class DB4OUtil {
     private static final String FILENAME = "C\\DataBank.db4o"; // path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){ //singleton,get instance
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
//two types of db in db4o: relationl n embedded..v use embedded
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();//creates new config of embedded
            config.common().add(new TransparentPersistenceSupport());//copy of obj,updates the obj and restores to orginal if anythng goes wrong,hence persistence
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Ecosystem system) {//done in logout (main j frame)
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Ecosystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        //query usin a identifier called ecosytem class
        ObjectSet<Ecosystem> systems = conn.query(Ecosystem.class); // Change to the object you want to save
        Ecosystem system;
        if (systems.size() == 0){
            system = ConfigureSystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);//gts topmst system in obj set of ecosystem
        }
        conn.close();
        return system;
    }
}
