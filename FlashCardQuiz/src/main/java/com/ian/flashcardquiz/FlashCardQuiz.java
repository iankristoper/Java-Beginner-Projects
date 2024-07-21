package com.ian.flashcardquiz;



import java.util.Scanner;
import java.util.ArrayList;










class FlashCard
{
    private String question;
    private String answer;
    
    public FlashCard(String question, String answer)
    {
        this.question = question;
        this.answer = answer;
    }
    
    
    public String getQuestion()
    {
        return question;
    }
    
    
    public String getAnswer()
    {
        return answer;
    }
    
    
    @Override 
    public String toString()
    {
        return "Question: " + question + "\nAnswer: " + answer; 
    }
      
}




public class FlashCardQuiz 
{
    private ArrayList<FlashCard> flashCardsArray = new ArrayList();
    private Scanner scanner = new Scanner(System.in);
    
    
    //methods to add a flashcard to the deck
    public void addFlashCard(String question, String answer)
    {
        FlashCard flashcard = new FlashCard(question, answer);
        flashCardsArray.add(flashcard);
    }
    
    
    
    public void startQuiz()
    {
        if(flashCardsArray.isEmpty())
        {
            System.out.println("Your card deck is empty!");
            return;
        }
        
        int correctCount = 0;
        
        
        for(FlashCard flashCard : flashCardsArray)
        {
            System.out.println("Quetion: " + flashCard.getQuestion());
            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine();
            
            
            if(userAnswer.equalsIgnoreCase(flashCard.getAnswer()))
            {
                System.out.println("Correct!");
                correctCount++;
            }
            else 
            {
                System.out.println("Incorrect! The answer is: " + flashCard.getAnswer());
            }
            
            System.out.println();
            
            
        }
        
        System.out.println("Job well done! You got " + correctCount + " Congratulations!");
        
        scanner.close();
        
    }

            
    
    
    

    public static void main(String[] args) 
    {
        FlashCardQuiz quiz = new FlashCardQuiz();
        
        quiz.addFlashCard("What is the largest continent", "Asia");
        quiz.addFlashCard("What is CPU", "Central Processing Unit");
        
        quiz.startQuiz();
    }
}
