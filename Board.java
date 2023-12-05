import java.util.Random;
class Board { 

  private int totalPieces;
  
  public Board(){
    Random random = new Random();
    totalPieces = random.nextInt(41) + 10;
  }

  public int getPieces() {
    return totalPieces;
  }
  
  public void removePieces(int takePieces){
    totalPieces -= takePieces;  
  }

  public void reset() {
    Random random = new Random();
    totalPieces = random.nextInt(41) + 10; 
  } 
}