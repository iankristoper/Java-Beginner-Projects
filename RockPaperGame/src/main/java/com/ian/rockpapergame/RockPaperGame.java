package com.ian.rockpapergame;

/**
 *
 * @author Ian Tagano
 */

import java.util.Random;
import java.util.Scanner;




public class RockPaperGame 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        int userWins = 0;
        int computerWins = 0;
        int draw = 0;
        
        
        System.out.println("Welcome to my Rock Paper Scissor Game!");
                
        
        boolean isProgramRunning = true;

        
        while(isProgramRunning)
        {
            System.out.print("Enter your choice [1] Rock [2] Paper [3] Scissor: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            
            
            int computer = random.nextInt(3) + 1;
            
            String result = null;
            
            
            
            if(input == 1)
            {
                result = "Rock";
            }
            else if(input == 2)
            {
                result = "Paper";
            }
            else if(input == 3)
            {
                result = "Scissor";
            }
            
            
            switch(computer)
            {
                case 1:
                    System.out.println("Computer: Rock || User: " + result );
                    break;
                    
                case 2: 
                    System.out.println("Computer: Paper || User: " + result);
                    break;
                    
                case 3:
                    System.out.println("Compuer: Scissor || User: " + result);
                    break;
                    
                default: 
                    throw new IllegalArgumentException("Invalid!");
                                            
            }
            
            
            if(computer == input)
            {
                System.out.println("The same!");
                draw++;
            } 
            else if((input == 1 && computer == 3) || (input == 2 && computer == 1) || (input == 3 && computer == 2))
            {
                System.out.println("You win!");
                userWins++;
            }
            else
            {
                System.out.println("You lose!");
                computerWins++;
            }
            
            
            System.out.print("Do you want to play again? yes/no: ");
            String playAgain = scanner.nextLine();
            
            if(!playAgain.equalsIgnoreCase("yes"))
            {
                isProgramRunning = false;
                
                System.out.println("Game results:");
                System.out.println("User wins: " + userWins);
                System.out.println("Computer wins: " + computerWins);
                System.out.println("Draws: " + draw);
            }
        }
        
        
        scanner.close();
    }
}
