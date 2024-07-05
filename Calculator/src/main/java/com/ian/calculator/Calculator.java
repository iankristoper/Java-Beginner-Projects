package com.ian.calculator;

import java.util.Scanner;



/**
 *
 * @author Ian Tagano
 */




class Math
{
    public static int addition(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }
    
    
    public static int subtraction(int firstNumber, int secondNumber)
    {
        return firstNumber - secondNumber;
    }
    
    public static int multiplication(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber;
    }
    
    public static int division(int firstNumber, int secondNumber)
    {
        if(secondNumber == 0)
        {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        
        return firstNumber / secondNumber;
    }
}




public class Calculator 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to my calculator!");
        System.out.println("Press 5 to exit!");
        
        boolean isProgramRunning = true;
        int result = 0;
        
        
        while(isProgramRunning)
        {
            
            System.out.print("Enter your first number: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Enter symbol [/] [*] [+] [-] [5]: ");
            String input = scanner.next();
            char symbol = input.charAt(0);
            
            System.out.print("Enter your second number: ");
            int secondNumber = scanner.nextInt();
            
            
            switch(symbol)
            {
                case '+':
                    result = Math.addition(firstNumber, secondNumber);
                    System.out.println("Total: " + result);
                    
                    break;
                    
                case '-':
                    result = Math.subtraction(firstNumber, secondNumber);
                    System.out.println("Total: " + result);
                    
                    break;
                    
                case '*':
                    result = Math.multiplication(firstNumber, secondNumber);
                    System.out.println("Total: " + result);
                    
                    break;
                    
                case '/':
                    result = Math.division(firstNumber, secondNumber);
                    System.out.println("Total: " + result);
                    
                    break;
                    
                case '5':
                    isProgramRunning = false;  
                    break;
                    
                default:
                    System.out.println("Error!");
                    break;
                               
            }
            
             
        }
        
         scanner.close();
        
    }
}
