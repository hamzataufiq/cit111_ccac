/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
/**
 *
 * @author hamza.taufiq
 */
public class MathQuiz {
     public static void main(String[] args) {
        int userAnswer;
        int correctAnswer = 2;
        int numLoops = 0;
        int attempts = 0;
        final int attemptsallowed = 3;
        System.out.println("***Math Checker***");
        
        Scanner userInputScanner = new Scanner(System.in);
       
       
        while(numLoops < 3)   
     
          
         while(true){
         
        System.out.println("Compute the value of (10%3)*2");
            
        userAnswer = userInputScanner.nextInt();
        
            if (userAnswer == correctAnswer) {
                System.out.println("Correct nice work!!!!");
                
            } else{ 
                System.out.println("Sorry,Incorrect!!");
            } if( attempts == attemptsallowed){ 
                System.out.println("Nice try! The answer is 5!");
                break; 
                
            } // close else
            numLoops = numLoops + 1;
         } // close while()loop
    } // close main method
    
} // close class 
   
    

