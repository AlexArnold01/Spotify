package Spotify;

public class Sang {
    private String title;
    private String artist;
    private Genre genre;

    //Constructor
    Sang(String title, String artist ){
this.title = title;
this.artist = artist;
    }
    //getters
public String getTitle() {return title;}
public String getArtist() {return artist;}
public Genre getGenre() {return genre;}

    //Setters
    public void setTitle(String title){this.title = title;}
    public void setArtist(String artist){this.artist = artist;}

}
