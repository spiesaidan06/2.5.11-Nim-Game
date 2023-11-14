// Aidan Spies
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
  public static String date;

  public MediaLib() {
    date = Date.getDateTime();
  }
  
  public void addBook(Book b)
  {
    if (book == null) {
      book = b;
      numEntries++;
      numBooks++;
      date = Date.getDateTime();
    } else {
      System.out.println("Book limit reached!");
    }
  }

  public void changeBook(Book b) {
    book = b;
    date = Date.getDateTime();
  }

  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m;
      numEntries++;
      numMovies++;
      date = Date.getDateTime();
    } else {
      System.out.println("Movie limit reached!");
    }
  }

  public void changeMovie(Movie m) {
    movie = m;
    date = Date.getDateTime();
  }

  public void addSong(Song s) {
    if (song == null) {
      song = s;
      numEntries++;
      numSongs++;
      date = Date.getDateTime();
    } else {
      System.out.println("Song limit reached!");
    }
  }

  public void changeSong(Song s) {
    song = s;
    date = Date.getDateTime();
  }

  public String toString() 
  {
    String info = "Library:\nLast Updated: " + date;
    if (book != null) {
      info += "\n" + book.getAuthor() + "'s " + book.getTitle();
    }
    if (movie != null) {
      info += "\n" + movie.getTitle() + ", Runtime: " + movie.getDuration() + " hours";
    }
    if (song != null) {
      info += "\n" + song.getTitle();
    }
    if (info == "Library:/nLast Updated: " + date) {
      info = "No media found!\n";
    }
    return info;
  }

  public static int getNumEntries() {
    return numEntries;
  }

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }

  public void testBook(Book tester) {
    tester.setTitle("tester");
    System.out.println(tester);
  }
  
}