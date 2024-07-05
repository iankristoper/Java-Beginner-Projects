
package com.ian.diceroller;

/**
 *
 * @author Ian Tagano
 */

import java.util.Scanner;
import java.util.Random;







public class DiceRoller 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.println("Welcome to my dice roller!");
        
        
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning)
        {
            System.out.print("Enter the number of dice to roll: ");
            int numberOfDice = scanner.nextInt();
            scanner.nextLine();
            
            
            System.out.println("Rolling " + numberOfDice + " dice...");
            
            
            for(int i = 1; i <= numberOfDice; i++)
            {
                int result = random.nextInt(6) + 1;
                System.out.println("Dice " + i + ": " + result);
            }
            
            
            
            System.out.print("Press 5 to sxit or any key to continue: ");
            String result = scanner.nextLine();
            
            
            if(result != "5")
            {
                isProgramRunning = true;
            }
                     
        }
        
        System.out.println("Thankyouuu for using my dice roller!");
        
        scanner.close();
    }
}
