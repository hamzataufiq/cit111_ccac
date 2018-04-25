/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects2_creatures;

/**
 *
 * @author hamza.taufiq
 */
public class Creature {
    public String name;
    public String species;
    
    private int biteSizeInPercent;
    private int numBitesTaken;
    private int sizeLimit;
    
    // Method to simulate eating donut
    public int eatDonut(SizedDonut donutToEat){
       donutToEat.simulateEating(biteSizeInPercent);
       numBitesTaken = numBitesTaken + 1;
        return numBitesTaken;
        
    }
        // "getter" method for a private member variables: sizeLimit  
    public int getSizeLimit() {
        // just send back the value of sizeLimit
        return sizeLimit;
    }
    // "setter" method for private member variable: sizeLimit
    public void setSizeLimit(int sizeLimit) {
        // we need guts to check for a reasonable size limit
        this.sizeLimit = sizeLimit;
        
    }
    // "getter" for numBitesTaken
    public int getNumBitesTaken() {
        // just send back the value of numBitesTaken
        return biteSizeInPercent;
        
    }
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int BiteSizeInPercent) {
        
        // we need guts to check bite size
        this.biteSizeInPercent = BiteSizeInPercent;
        
    }
} // close class
