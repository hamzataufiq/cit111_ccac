/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planeFinal;

/**
 *
 * @author hamza.taufiq
 */
public class Plane {
    public String origin;
    public String destin;
    public String airline;
    public int passengers;
    public int speed;
    public double fuelCapacity;
    public double fuelBurnRate;
    public double distanceToitsDestin;
    
    
    public int totalMilesFlown =0;
    
    public void flyAirplane(int totalMiles) {
        totalMilesFlown = totalMiles + totalMilesFlown; 
    } // close method
    
    public void displayTotalMilesFlown() {
        System.out.println("Total miles Flown: " + this.totalMilesFlown);
    }
}
