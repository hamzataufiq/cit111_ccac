/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author hamza
 */
public class UnitConverter {
    public static void main(String[] args){
        
        System.out.println("***********UNIT CONVERTER***********");
        
        Scanner inputScanner = new Scanner (System.in);
        
        System.out.println("Enter one length from a square to find it's perimeter. ");
        
       int userHeight = inputScanner.nextInt();
       
       int permSquare = calcPerimeterOfSquare (userHeight);
       
      
       System.out.println("The perimeter of a square with a side length of " + userHeight + " is " + permSquare);
                     System.out.println("------------------------------------");
     
               
       System.out.println("To find the perimeter of rectangle");
        
              System.out.println("Enter the rectangle length:");
       
        double rectLength = inputScanner.nextDouble();
    
              System.out.println("Enter the rectangle width:");
       
        double rectWidth = inputScanner.nextDouble();
       
        
        double permRect = calcPerimeterOfRectangle (rectLength, rectWidth);
        
        
        
        System.out.println("The perimeter of square with a side length of: " + rectLength + " and wifth of " + rectWidth + " is " + permRect);
       
        System.out.println("--------------------------------------------");    
        
    }//closes main
    
    public static int calcPerimeterOfSquare (int userHeight){
        final int square = 4;
        
        int permSquare = square * userHeight;
         
     return permSquare;   
    }//closes method
      
    public static double calcPerimeterOfRectangle (double rectLength, double rectWidth){
        final double P = 2;
        
        double permRect = P * (rectLength + rectWidth);
        
        return permRect;
    }//closes method   
} // close class
