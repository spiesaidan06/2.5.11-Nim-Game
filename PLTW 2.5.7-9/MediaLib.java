/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;
  public static String owner = "PLTW";

  public void addBook(Book b)
  {
    if (book == null) {
      book = b;
      numEntries++;
      numBooks++;
    } else {
      System.out.println("Book limit reached!");
    }
  }

  public void changeBook(Book b) {
    book = b;
  }

  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m;
      numEntries++;
      numMovies++;
    } else {
      System.out.println("Movie limit reached!");
    }
  }

  public void changeMovie(Movie m) {
    movie = m;
  }

  public void addSong(Song s) {
    if (song == null) {
      song = s;
      numEntries++;
      numSongs++;
    } else {
      System.out.println("Song limit reached!");
    }
  }

  public void changeSong(Song s) {
    song = s;
  }

  public String toString() 
  {
    String info = "Library:";
    if (book != null) {
      info += "\n" + book.getAuthor() + "'s " + book.getTitle();
    }
    if (movie != null) {
      info += "\n" + movie.getTitle() + ", Runtime: " + movie.getDuration() + " hours";
    }
    if (song != null) {
      info += "\n" + song.getTitle();
    }
    if (info == "Library:") {
      info = "No media found!\n";
    }
    return info;
  }

  public static int getNumEntries() {
    return numEntries;
  }

  public void testBook(Book tester) {
    tester.setTitle("tester");
    System.out.println(tester);
  }
  
}