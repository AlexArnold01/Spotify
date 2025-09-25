
package Spotify;


public class Sang {
    private String title;
    private String artist;
    private Genre genre;



        //Constructor
    Sang(String title, String artist, Genre genre) {
        this.title = title;
        this.artist = artist;
    }
    //getters
    public String getTitle() {return title;}
    public String getArtist() {return artist;}
    public Genre getGenre() {return genre;}

    //Setters
    public void setTitle(String title) {this.title = title;}
    public void setArtist(String artist) {this.artist = artist;}
    public void setGenre(Genre genre){this.genre = genre;}



@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Sang sang = (Sang) obj;
    return title.equalsIgnoreCase(sang.title) &&
            artist.equalsIgnoreCase(sang.artist);
}
}
