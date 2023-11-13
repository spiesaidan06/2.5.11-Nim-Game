 /* Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    myLib.addBook(myBook);

    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Movie myMovie = new Movie("Attack on Titan", 1.5);
    Movie otherMovie = new Movie("FNAF", 2.0);
    myLib.addMovie(myMovie);

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);
  }
}