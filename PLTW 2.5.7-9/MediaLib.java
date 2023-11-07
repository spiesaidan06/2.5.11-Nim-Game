/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m) {
    movie = m;
  }

  public String toString() 
  {
    String info = "Library:\n";
    if (book != null) {
      info += book.getAuthor() + "'s " + book.getTitle() + "\n";
    }
    if (movie != null) {
      info += movie.getTitle() + ", Runtime: " + movie.getDuration() + " hours\n";
    }
    if (info == "Library:\n") {
      info = "No media found!";
    }
    return info;
  }

  public void testBook(Book tester) {
    tester.setTitle("tester");
    System.out.println(tester);
  }
  
}