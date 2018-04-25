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
public class SceneO {
    public static void main(String[] args) {
        Creature owl;
        owl = new Creature();
        
        owl.name = "Snowy owl";
        owl.species = "eastern screech";
    
        
        SizedDonut d = new SizedDonut();
        d.id = 300;
        d.type = "apple crisp";
        
        printSizedDonutStats(d);
        
        System.out.println("Eating donut.....");
        
        owl.setBiteSizeInPercent(66);
        
        owl.eatDonut(d);
        printSizedDonutStats(d);
    } // close main
    
    public static void printSizedDonutStats(SizedDonut donutToPrint) {
        System.out.println("***STATS***");
        System.out.println("Flavor: " + donutToPrint.type);
        System.out.println("ID: " + donutToPrint.id);
        System.out.println("PercRemaining: " + donutToPrint.getPercRemaining());
        
    }
    
}
