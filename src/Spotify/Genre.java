package Spotify;

public enum Genre {
    ROCK("Rock"),
    POP("Pop"),
    RAP("Rap"),
    JAZZ("Jazz");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}