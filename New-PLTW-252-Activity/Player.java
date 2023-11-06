/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int score;
  
  /* your code here - constructor(s) */ 
  public Player() {
    boolean goodName = false;
    while (!goodName) {
      System.out.println("Enter player name!");
      Scanner sc = new Scanner(System.in);
      name = sc.nextLine();
      if (name.length() == 0) {
        System.out.println("Name too short!");
      } else goodName = true;
    }
    System.out.println("Welcome to the game "+ name+ "!");
    System.out.println();
    score = 0;
  }

  public Player(String inputName) {
    name = inputName;
    System.out.println("Welcome to the game " + name + "!");
    score=0;
  }

  /* your code here - accessor(s) */ 
  public String getName() {//returns name and creates a method
    return name;
  }

  public int getScore() {//returns score and creates a method
    return score;
  }
  /* your code here - mutator(s) */ 
  public void setName(String newName) {//makes a method where the user can change the name
    name = newName;
  }

  public void addScore(int points) {//makes a method where the user can 
    score += points;
  }
}