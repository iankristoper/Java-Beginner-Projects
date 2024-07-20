package com.ian.stopwatch;


import java.util.Scanner;





public class StopWatch 
{
    //intance variables 
    private long startTime = 0;
    private long endTime = 0;
    private static boolean isProgramRunning = true;
    
    
    //method for starting the timer
    public void start()
    {
        this.startTime = System.currentTimeMillis();
        StopWatch.isProgramRunning = true;
    }
    
    
    //method for ending the timer 
    public void stop()
    {
        this.endTime = System.currentTimeMillis();
        StopWatch.isProgramRunning = false;
    }
    
    
    public void reset()
    {
        startTime = 0;
        endTime = 0;
        isProgramRunning = false;
    }
    
    
    public long getElapsedTime()
    {
        long elapsed;
        
        if(isProgramRunning)
        {
            elapsed = System.currentTimeMillis() - startTime;
            
        }
        else 
        {
            elapsed = endTime - startTime;
        }
        
        
        return elapsed;
    }
    

    public static void main(String[] args) 
    {
        StopWatch timer = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Simple stop watch...");
        System.out.println("Commands: start, stop, reset, exit");
        
        
        while(isProgramRunning)
        {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim().toLowerCase();
            
            
            switch(command)
            {
                case "start":
                    timer.start();
                    break;
                    
                case "stop":
                    timer.stop();
                    System.out.println("Stopwatch stopped");
                    System.out.println("Time elapsed: " + timer.getElapsedTime());
                    break;
                    
                case "reset":
                    timer.reset();
                    System.out.println("Timer reset.");
                    break;
                    
                case "exit":
                    isProgramRunning = false;
                    scanner.close();
                    break;
                    
                default:
                    System.out.println("Unknown command!");
                        
            }
        }
    }
}
