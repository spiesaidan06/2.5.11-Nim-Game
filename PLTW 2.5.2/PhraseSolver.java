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
    player1 = new Player("Aidan");
    player2 = new Player("Arun");
    board = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    
    while (!solved) 
    {
      /* your code here - game logic */
      System.out.println();
      if (currentPlayer == 1) {
        System.out.println(player1.getName());
      } else {
        System.out.println(player2.getName());
      }
      
      System.out.println(board.getSolvedPhrase());
      System.out.println(board.getPhrase());

      /* your code here - determine how game ends */
      solved = true; 
    } 

  }

}