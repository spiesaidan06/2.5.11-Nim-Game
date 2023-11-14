// Aidan Spies
public class MediaLibRunnerStatic {
  
  public static void main(String[] args) {
    MediaLib myLib = new MediaLib();
    Movie myMovie = new Movie("My Movie", 2);
    myLib.addMovie(myMovie);
    Book theBook = new Book("The Book", "The Author");
    myLib.addBook(theBook);
    Book eBook = new Book("eBook", "eAuthor");
    myLib.changeBook(eBook);
    Movie whoMovie = new Movie("Who?", 3);
    myLib.changeMovie(whoMovie);
    Song mySong = new Song("Best Song Ever!");
    myLib.addSong(mySong);
    System.out.println(myLib);
    System.out.println(MediaLib.getNumEntries());
  } 
}