package com.ian.randomjoke;




import java.util.List;
import java.util.ArrayList;
import java.util.Random;







public class RandomJoke 
{

    public static void main(String[] args) 
    {
        List<String> jokes = new ArrayList<>();
        
        
        jokes.add("Hey this is my first joke, what a lucky guy!");
        jokes.add("Oh! This is my second joke, how lucky you are!");
        jokes.add("This is my third joke, its so nice right?");
        
        
        Random random = new Random();
        
        int randomIndex = random.nextInt(jokes.size());
        
        System.out.print("This is the joke: " + jokes.get(randomIndex));
        
        
            
    }
}
