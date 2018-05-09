/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planeFinal;

import transport.Airplane;

/**
 *
 * @author hamza.taufiq
 */
public class Sky {
    public static void main(String[] args) {
        Plane firstPlane = new Plane();
        double firstPlaneEndurance;
        firstPlane.airline = "Emirates";
        firstPlane.origin = "Pennsylvania";
        firstPlane.destin = "Texas";
        firstPlane.passengers = 266;
        firstPlane.speed = 900;
        firstPlane.fuelCapacity = 320000;
        firstPlane.fuelBurnRate = 84600;
        firstPlane.distanceToitsDestin = 1408;
        
        firstPlaneEndurance = firstPlane.fuelCapacity / firstPlane.fuelBurnRate;
        
               
        System.out.println("Name of the airline: " + firstPlane.airline);
        System.out.println("Origin: " + firstPlane.origin);
        System.out.println("Destination: " + firstPlane.destin);
        System.out.println("Number of passengers: " + firstPlane.passengers);
        System.out.println("Speed of the plane mp/h: " + firstPlane.speed +"mph");
        System.out.println("Plane fuel capacity: " + firstPlane.fuelCapacity + "liters");
        System.out.println("Fuel's burn rate per gallons: " + firstPlane.fuelBurnRate + "gallons");
        
        Airplane firstAirplane = new Airplane();
        firstAirplane.flyAirplane(4500);
        
        System.out.println("Total miles flown: " + firstAirplane.totalMilesFlown);
        
        System.out.println("A plane can stay aloft for " + firstPlaneEndurance + "hours");
        
    } // close main
    
} // close class
