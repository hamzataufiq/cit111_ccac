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
public class SceneT {
    public static void main(String[] args) {
        
        Creature turtle;
        turtle = new Creature();
        
        turtle.name = "Ninja";
        turtle.species = "Pond Slider";
        turtle.setBiteSizeInPercent(33);
        
        SizedDonut donutForTurtle = new SizedDonut();
        donutForTurtle.name = "Slick";
        donutForTurtle.type = "Powdered";
        donutForTurtle.id = 102;
        
        turtle.eatDonut(donutForTurtle);
        
        System.out.println("Donut left for Slick: " + donutForTurtle.getPercRemaining());
        
    } // close main
    
} // close class
