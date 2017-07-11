/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Random;

/**
 *
 * @author vega
 */
public class RandomDataGenerator {
 
public int generateAQI() 
{
    
    Random aRandom =new Random();

 int randomNumber = (int)aRandom.nextInt(500); 
 
 return randomNumber;

} 
 public int generateTemp()
 { 
     Random aRandom =new Random(); 
 
 int randomNumber = (int)aRandom.nextInt(100); 
 
 return randomNumber;
 } 
}
