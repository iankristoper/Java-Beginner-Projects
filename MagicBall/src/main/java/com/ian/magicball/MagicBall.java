package com.ian.magicball;

/**
 *
 * @author Ian Tagano
 */

import java.util.Scanner;
import java.util.Random;





public class MagicBall 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        String[] responses = {
            "Yes it is",
            "No its not",
            "It is you",
            "what the fuck"    
        };
        
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning)
        {
            System.out.println("Welcome to magic ball!");
            System.out.print("Enter yes/no: ");
            scanner.nextLine();
            
            int randomNumber = random.nextInt(responses.length);
            String response = responses[randomNumber]; 
            System.out.println("The magic ball said: " + response);
            
            
            System.out.print("Press 5 to exit or 1 to continue: ");
            int exit = scanner.nextInt();
            scanner.nextLine();
            
            
            if(exit == 5)
            {
                isProgramRunning = false;
            }
               
        }
        
          
        scanner.close();
   
    }
}
