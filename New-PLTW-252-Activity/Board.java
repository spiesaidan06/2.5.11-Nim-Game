/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  public Board() {
    solvedPhrase = "";
    phrase = loadPhrase();
    currentLetterValue = 0;
    setLetterValue();
  }
  
  /* your code here - accessor(s) */
  public String getSolvedPhrase() {
    return solvedPhrase;
  }

  public String getPhrase() {
    return phrase;
  }

  public int getLetterValue() {
    return currentLetterValue;
  }

  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";

    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

    int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  

    return tempPhrase;
  }  
  /*
  Checks if the letter the user guessed is correct
  
  Precondition:
    Guess is initialized and is populated
  Postcondition:
    The variable newsolved phrase is populated 
    Newsolvedphrase is appended
  */
  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false; // creates a boolean, foundLetter, which is initially set to false
    String newSolvedPhrase = ""; // creates an empty String

    // iterates through each letter of phrase
    for (int i = 0; i < phrase.length(); i++)
    {
      // checks if the guess is the same as the letter
      if (phrase.substring(i, i + 1).equals(guess))
      {
        // If the condition if fulfilled, the letter is added to the newSolvedPhrase String
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
        // adds the blank and the space from the String solved phrase
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " "; 
      }
    }
    // sets the solvedPhrase to the newSolvedPhrase String
    solvedPhrase = newSolvedPhrase;
    return foundLetter; //returns the variable foundLetter
  } 
} 