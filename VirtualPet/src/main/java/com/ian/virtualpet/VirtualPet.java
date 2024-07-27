package com.ian.virtualpet;


import java.util.Scanner;





public class VirtualPet 
{
    //Global Variables 
    static int hunger = 1;
    static int happiness = 100;
    static int energy = 100;
    static Scanner scanner = new Scanner(System.in);
    
    

    public static void main(String[] args) 
    {
        
        boolean isProgramRunning = true;
        
        
        System.out.println("Welcome! This is your virtual pet!");
        
        
        while(isProgramRunning)
        {
            displayStatus();
            System.out.println("What would you like to do?");
            System.out.println("[1] Feed");
            System.out.println("[2] Play");
            System.out.println("[3] Rest");
            System.out.println("[4] Quit");
            System.out.print("Please enter your choice here: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            
            
            switch(input)
            {
                case 1:
                    feedPet();
                    break;
                    
                case 2: 
                    playPet();
                    break;
                    
                case 3: 
                    restPet();
                    break;
                    
                case 4:
                    isProgramRunning = false;
                    break;
                    
                default: 
                    throw new IllegalArgumentException("Invalid Input!");
            }
            
        }
            
        
        
    }
    
    public static void displayStatus()
    {
        if(happiness > 100 || energy > 100)   
        {
            happiness = 100;
            energy = 100;
        }
            
        
        
        if(hunger < 0)
        {
            hunger = 0;
        }
            
        
                       
        System.out.println("This is your pet status");
        System.out.println("Hunger: " + hunger);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy: " + energy);
    }
    
    
    
    public static void feedPet()
    {
    
        
        System.out.print("How mucn food do you want to feed to your pet: ");
        int feedInput = scanner.nextInt();
        scanner.nextLine();
        
        hunger = hunger - feedInput;
        
        System.out.println("Congrats! You have fed your pet!");
        System.out.println("Hunger now is: " + hunger);
    }
    
    
    
    public static void playPet()
    {
        System.out.println("This play pet will increase the pets happiness to 10 but incress the hunger to 15");
        System.out.print("Do you want to continue: ");
        String petInput = scanner.nextLine();
        
        if(petInput.equalsIgnoreCase("yes"))
        {
            happiness = happiness + 10;
            hunger = hunger + 15;
            
            System.out.println("Congratulations! You have been played your pet!");
            System.out.println("Happiness +10");
            System.out.println("Hungry +15");
            
        } 
        else
        {
            System.out.println("Thanks for choosing");
        }   
        
                                      
    }
    
    
    
    public static void restPet()
    {
        System.out.println("Resting your pet will add the follow: ");
        System.out.println("Happiness +50");
        System.out.println("Hunger +15");
        System.out.println("Energy +70");
        System.out.print("Do you wish to continue: ");
        String restInput = scanner.nextLine();
        
        if(restInput.equalsIgnoreCase("yes"))
        {
            hunger = hunger + 15;
            happiness = happiness + 50;
            energy = energy + 70;
            
            System.out.println("Perks successfully added!");
        } 
        else 
        {
            System.out.println("Thanks for choosing");
        }
                       
    }
    
    
}
