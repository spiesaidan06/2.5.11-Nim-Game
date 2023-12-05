import java.util.Scanner;
import java.util.Random;
class Main {
  private static Player p1 = new Player();
  private static Player p2 = new Player();
  private static Board game = new Board();
  
  public static void main(String[] args) {
    Random rand = new Random();
    boolean p1Turn = true;
    boolean play = true;
    Scanner sc = new Scanner(System.in);
    String input;
    int pieces = 0;
    System.out.println("Welcome to the Game of Nim!");
    boolean goodInput = false;
    while(goodInput == false) {
      System.out.println("Do you know how to play Nim? (yes/no)");
      input = sc.nextLine();
      if (input.toLowerCase().equals("no")) {
        System.out.println("In Nim, 2 players alternate turns where they take pieces from a pile. During each turn, a player must take at least one piece, but can't take more than half of the pile.\n");
        goodInput = true;
      } else if (input.toLowerCase().equals("yes")) {
        System.out.println("Great! Let's get started.\n");
        goodInput = true;
      } else {
        System.out.println("Invalid input. Please type yes or no.");
      }
    }  
    goodInput = false;

    System.out.println("Enter Player 1's name:");
    input = sc.nextLine();
    p1.changeName(input);

    System.out.println("Would you like Player 2 to be a bot? (yes/no)");
    input = sc.nextLine();
    if (input.toLowerCase().equals("yes")) {
      p2.swapControl();
    } else {
      System.out.println("Enter Player 2's name:");
      input = sc.nextLine();
      p2.changeName(input);
    }

    Player currentPlayer;
    int randomTurn;
    while (play) {
      System.out.println();
      System.out.println("Pieces Left: " + game.getPieces());
      if (p1Turn) {
        currentPlayer = p1;
      } else {
        currentPlayer = p2;
      }
      
      System.out.println(currentPlayer.getName() + "'s Turn!");
      while(!goodInput) {
        if (currentPlayer.isABot()) {
          int botPieces = rand.nextInt(game.getPieces()/2) + 1;
          game.removePieces(botPieces);
          System.out.println(currentPlayer.getName() + " took " + botPieces + "!");
          goodInput = true;
        } else {
          System.out.println("How many pieces do you want to take?");
          input = sc.nextLine();
          try {
            pieces = Integer.valueOf(input);
          } catch (Exception e) {
            System.out.println("Please input an integer!");
          }
          if (pieces > 0 && pieces <= game.getPieces()/2) {
            game.removePieces(pieces);
            goodInput = true;
          } else {
            System.out.println("Take at least one piece, but less than half of pieces left!");
          }
        }
      }
      goodInput = false;
      
      if (game.getPieces() == 1) {
        System.out.println();
        currentPlayer.increaseScore();
        System.out.println(currentPlayer.getName() + " won!");
        System.out.println(p1.getName() + ": " + p1.getScore());
        System.out.println(p2.getName() + ": " + p2.getScore());
        System.out.println(game.getPieces());
        
        System.out.println("Play again? (yes/no)");
        input = sc.nextLine();
        if (input.toLowerCase().equals("no")) {
          play = false;
        } else {
          System.out.println("Restarting...\n");
          game.reset();
          randomTurn = rand.nextInt(1);
          if (randomTurn == 0) {
            p1Turn = true;
          } else {
            p1Turn = false;
          }
        }
      }

      if (currentPlayer == p1) {
        p1Turn = false;
      } else {
        p1Turn = true;
      }
    }
  }
}
