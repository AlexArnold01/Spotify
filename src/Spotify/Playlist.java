package Spotify;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Sang> playlist = new ArrayList<>();

    public Playlist(){
    }

    public ArrayList<Sang> getPlaylist(){
        return playlist;
    }

    public void setPlaylist(ArrayList<Sang> playlist){
        this.playlist = playlist;
    }

    public void addSong(String title, String artist, Genre genre) {
        Sang sang = new Sang(title, artist, genre);
        playlist.add(sang);
    }

    public String toString(){
        return playlist.toString();
    }

    public void removeSong(String title) {
        playlist.removeIf(sang -> title.equals(sang.getTitle()));
        //  skal laves om til en try catch metode
    }

    public void printPlaylist() {
        System.out.println("------PLAYLISTE------\n");
        for(Sang sang : playlist) {
            System.out.println("Title: " + sang.getTitle() + ", Kunstner: " + sang.getArtist() + "\n");
        }
    }
}

