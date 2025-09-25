package Spotify;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void removeSong(Scanner sc) {
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Vælg hvilken sang du vil fjerne: ");
                int songNum = sc.nextInt();
                Sang removed = playlist.remove(songNum);
                System.out.println("Fjernet: " + removed.getSong());
                valid = true;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Skriv gerne en valid Sang :)");
            }
        }
    }


    public void printPlaylist() {
        System.out.println("------PLAYLISTE------\n");
        for(Sang sang : playlist) {
            System.out.println("Title: " + sang.getTitle() + ", Kunstner: " + sang.getArtist() + "\n");
        }
    }
}

