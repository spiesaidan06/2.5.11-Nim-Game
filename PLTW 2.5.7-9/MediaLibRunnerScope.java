// Aidan Spies
public class MediaLibRunnerScope {

  public static void main(String[] args) {
    MediaLib myLib = new MediaLib();
    myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
    myLib.addBook(new Book("1984", "Orwell"));
    myLib.addSong(new Song("In Your Eyes"));
    System.out.println(MediaLib.owner + "'s " + myLib);
    Book leBook = new Book("LeGloriousKing", "LeBronsexual");
    leBook.adjustRating(5);
    leBook.adjustRating(4);
  }
}