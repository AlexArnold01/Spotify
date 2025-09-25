package Spotify;

import java.sql.SQLOutput;
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

    public void removeSong(int index) {
        try {
            Sang removed = sang.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Skriv gerne en valid Sang :)");
        }
        }
        //  skal laves om til en try catch metode
    }

    public void printPlaylist() {
        System.out.println("------PLAYLISTE------\n");
        for(Sang sang : playlist) {
            System.out.println("Title: " + sang.getTitle() + ", Kunstner: " + sang.getArtist() + "\n");
        }
    }


