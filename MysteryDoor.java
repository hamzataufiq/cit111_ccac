/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;


        

/**
 *
 * @author Basma
 */
public class MysteryDoor {
      public static void main(String[] args) {
        final int SELECTOR = 3; 
        System.out.println("What bike is under the bike cover");
        System.out.println("-----1:BMW K 1200S, 2:Honda CBR , or 3:Suzuki-----");
        
         displayCarStats();
         displayCarPrice();
         System.out.println("_____________________");
        
                 
                 
                   
    } // close main
    
    public static void displayCarStats(){
         System.out.print("-----164 horse power---"); 
         System.out.print("---4cylinder 153 horse power---");
         System.out.println("---248 mph speed---");       
    
    } // close car stat method
    
    public static void displayCarPrice(){
        System.out.print("-----$250,000---");
        System.out.print("---$150,000---");
        System.out.println("---$200,000---");
        
        System.out.println("Enter the ONE DOOR number you'd like to open -  1 , 2 , 3");
        
        //create a Scanner object
        Scanner userInput = new Scanner(System.in);
        //read the values from the console and store it
        
    } // close car price method
    
} // close class     

    

