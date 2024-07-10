package com.ian.recipebook;

import java.util.Scanner;
import java.util.ArrayList;






class Recipe
{
    //private instance variables
    private String name;
    private String ingredients;
    private String instructions;
    
    
    //constructor
    public Recipe(String name, String ingredients, String instructions)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
    
    
    public String getName()
    { 
        return name;
    }
    
    
    public String ingredients()
    {
        return ingredients;
    }
    
    
    public String instructions()
    {
        return instructions;
    }
    
    
    
    @Override
    public String toString()
    {
        return "Recipe Name: " + name + "\nIngredients:\n" + ingredients + "\nInstructions:\n" + instructions;
    }            
    
}





public class RecipeBook 
{
    private static ArrayList<Recipe> recipesArray = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        boolean isProgramRunning = true;
        
        
        System.out.println("Welome to my recipe book!");
        
        
        while(isProgramRunning)
        {
            System.out.println("\nSelect an option:");
            System.out.println("[1] Add a new recipe");
            System.out.println("[2] Display all recipes");
            System.out.println("[3] Quit");
            
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice)
            {
                case 1:
                    addRecipe();
                    break;
                    
                case 2:
                    displayAllRecipe();
                    break;
                    
                case 3:
                    isProgramRunning = false;
                    break;
                    
                default:
                    throw new IllegalArgumentException("Invalid choice!");
            }
        }
        
        System.out.println("Thankyou for using my Recipe book!");
        scanner.close();
    }
    
    
    //Function to add recipe to the recipe book
    private static void addRecipe()
    {
        System.out.print("Enter recipe name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter ingredients (seperate with comma): ");
        String ingredients = scanner.nextLine();
        
        System.out.println("Enter instructions: ");
        String instructions = scanner.nextLine();
        
        Recipe recipe = new Recipe(name, ingredients, instructions);
        recipesArray.add(recipe);
        
        System.out.println("Recipes added successfully!");
                
    }
    
    
    //Function to display all the content in the recipe book
    private static void displayAllRecipe()
    {
        if(recipesArray.isEmpty())
        {
            System.out.println("No recipes written in the book!");
        } 
        else 
        {
            for(Recipe recipeHolder : recipesArray)
            {
                System.out.println(recipeHolder);
            }
        }
        
        
    }
    
     
}
