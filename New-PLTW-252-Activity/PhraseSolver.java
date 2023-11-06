/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;
  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    player1 = new Player();
    player2 = new Player();
    board = new Board();
    solved = false;
  }

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;
    String currentPlayerName = "";
    String guess = "";

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    
    while (!solved) 
    {
      /* your code here - game logic */
      System.out.println();
      if (currentPlayer == 1) {
        currentPlayerName = player1.getName();
      } else {
        currentPlayerName = player2.getName();
      }
      System.out.println(currentPlayerName + "'s turn!");
      System.out.println("Make a guess!");
      guess = input.nextLine();
      board.getSolvedPhrase();
      solved = board.isSolved(guess);
      
      /* your code here - determine how game ends */
      if (solved) {
        if (currentPlayer == 1) {
          player1.addScore(2000);
        } else {
          player2.addScore(2000);
        }
        System.out.println();
        System.out.println(currentPlayerName + " has guessed the phrase!");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());
        if (player1.getScore() > player2.getScore()) {
          System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
          System.out.println(player2.getName() + " wins!");
        }
      } else {
        if (board.getSolvedPhrase().contains(guess)){
          System.out.println("Don't type a letter you already inputted!");
        } else {
          correct = board.guessLetter(guess);
          if (correct) {
            board.setLetterValue();
            if (currentPlayer == 1) {
              player1.addScore(board.getLetterValue());
              System.out.println(player1.getName() + " got " + board.getLetterValue() + " points!");
            } else {
              player2.addScore(board.getLetterValue());
              System.out.println(player2.getName() + " got " + board.getLetterValue() + " points!");
            }
          } else {
            System.out.println("Wrong! " + currentPlayerName + " lost 100 points!");
            if (currentPlayer == 1) {
              player1.addScore(-100);
              currentPlayer = 2;
            } else {
              player2.addScore(-100);
              currentPlayer = 1;
            }
          }
        }
        System.out.println(board.getSolvedPhrase());
      }
    }
  }
}