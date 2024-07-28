package com.ian.simpledrawingapp;



import java.util.Scanner;





public class SimpleDrawingApp 
{
    //constants for canva size
    static final int CANVAS_WIDTH = 10;
    static final int CANVAS_HEIGHT = 10;
    
    
    //2D array to represent the canvas
    static char[][] canvas = new char[CANVAS_HEIGHT][CANVAS_WIDTH];
    
    
    //scannr object for user input
    static Scanner scanner = new Scanner(System.in);

    
    
    //MAIN FUNCTION
    public static void main(String[] args) 
    {
        //initialize canva with blank canvas
        initializeCanvas();       
        boolean isProgramRunning = true;
        
        
        System.out.println("Welcome to my simple drawing app!");
        
        
        while(isProgramRunning)
        {
            displayCanvas();  // Display the current state of the canvas
            System.out.println("\nSelect an option:");
            System.out.println("[1] Draw a line");
            System.out.println("[2] Clear canvas");
            System.out.println("[3] Quit");
            
            System.out.println("Enter your choices here: ");
            int mainInput = scanner.nextInt();
            scanner.nextLine();
            
            switch(mainInput)
            {
                case 1:
                    drawLine();
                    break;
                    
                case 2: 
                    clearCanvas();
                    break;
                    
                case 3:
                    isProgramRunning = false;
                    break;
                    
                default:
                    throw new IllegalArgumentException("Invalid Input!");
                    
            }
            
            
            
            
            
        }                         
        
    }
    
    
    
    //methods for initializing canvas
    public static void initializeCanvas()
    {
        for(int i = 0; i < CANVAS_HEIGHT; i++)
        {
            for(int j = 0; j < CANVAS_WIDTH; j++)
            {
                canvas[i][j] = ' ';
            }
        }
    }
    
    
    //methods for displaying canva status 
    public static void displayCanvas()
    {
        System.out.println("Current Canvas: ");
        for(int i = 0; i < CANVAS_HEIGHT; i++)
        {
            for(int j = 0; j < CANVAS_WIDTH; j++)
            {
                System.out.println(canvas[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
    //methods for drawing a line 
    public static void drawLine()
    {
        System.out.println("Enter coordinates (x1 y1 x2 y2) for the line:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline character after reading integer input
        
        
        //verify if the coordinates is valid
        if(isCoordinatesValid(x1, y1) && isCoordinatesValid(x2, y2))
        {
            
        }
    }
    
    
    
    //methods to validate the coordinates
    public static boolean isCoordinatesValid(int x, int y)
    {
        return x >= 0 && x < CANVAS_HEIGHT && y >= 0 && y < CANVAS_WIDTH;
    }
    
}
