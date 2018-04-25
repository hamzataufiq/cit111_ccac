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
public class CreatureLand {
    public static void main(String[] args) {
        // make a pointer variables
      Creature penguin;
      penguin = new Creature();
      // writting member variables value
      penguin.name = "Pablo";
      penguin.species = "Emporer Penguin";
      penguin.setSizeLimit(40);
      penguin.setBiteSizeInPercent(5);
      
      SizedDonut donutForPenguin = new SizedDonut();
      donutForPenguin.name = "Chole";
      donutForPenguin.sizeInmm = 32;
      
      penguin.eatDonut(donutForPenguin);
      
      System.out.println("Donut left: " + donutForPenguin.getPercRemaining());
      
      implementSceneR();
      
    } // close main
    
    public static void implementSceneR() {
        
       
    } // close implementSceneR
    
}
