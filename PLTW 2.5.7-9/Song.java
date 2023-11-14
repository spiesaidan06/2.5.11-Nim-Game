// Aidan Spies
public class Song {

  private String title;
  private int rating;

  public Song(String t) {
    title = t;
  }

  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public boolean equals(Song s) {
    if(title.equals(s.getTitle())) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    String info = title;
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }
  
}