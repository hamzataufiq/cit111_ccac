/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author hamza.taufiq
 */
public class Logical {
    public static void main(String[] args){
         System.out.println("Will I Make It?");
        double MPG = 28;
        double milesleft;
        double gasleft;
        
      
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("How many gallons of gas remain in your tank?");
          gasleft = userInputScanner.nextDouble();
          
          System.out.println("How many miles to the next gas station");
        milesleft = userInputScanner.nextDouble();
        
        if(gasleft*MPG>milesleft) {
            System.out.println("You'll make it to the next station!");
        } else {
            System.out.println("You'll soon be marooned!");
        } // close else
    } // close class
    
    
} // close main
