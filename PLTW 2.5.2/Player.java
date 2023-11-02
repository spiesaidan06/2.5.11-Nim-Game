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
    System.out.println("Enter player name!");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.println("Welcome to the game "+ name+ "!");
    score = 0;
  }

  public Player(String inputName) {
    name = inputName;
    System.out.println("Welcome to the game " + name + "!");
    score=0;
  }

  /* your code here - accessor(s) */ 
  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }
  /* your code here - mutator(s) */ 
  public void setName(String newName) {
    name = newName;
  }

  public void setScore(int points) {
    score += points;
  }
}