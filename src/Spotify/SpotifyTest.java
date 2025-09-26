package Spotify;

import java.util.Scanner;

public class SpotifyTest {

    public static void main(String[] args) {
        welcomeMessage();
        appLoop();
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to your homemade Spotify! Please choose an option:");
    }

    public static void appLoop() {
        Playlist playlist = new Playlist();
        Scanner sc = new Scanner(System.in);
        boolean keepAlive = true;
        while(keepAlive) {
            System.out.println("1. Tilføj ny sang");
            System.out.println("2. Fjern en sang");
            System.out.println("3. Vis alle sange");
            System.out.println("4. Søg efter en sang");
            System.out.println("5. Rediger en sang");
            System.out.println("6. Afslut programmet");
            int userInput = sc.nextInt();
            sc.nextLine();  //calling nextLine in order to consume 'Enter'-key input

            switch(userInput) {
                case 1:
                    System.out.println("Du har valgt at tilføje en sang.");
                    System.out.println("Vælg en titel");
                    String title = sc.nextLine();
                    System.out.println("Vælg en kunstner");
                    String artist = sc.nextLine();
//                    System.out.println("Vælg en genre");
//                    Genre genre = Genre.valueOf(sc.nextLine());
                    playlist.addSong(title, artist, Genre.JAZZ);
                    break;
                case 2:
                    playlist.removeSong(sc);

                    break;
                case 3:
                    //System.out.println(playlist.toString());
                    playlist.printPlaylist();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Lukker programmet ned...");
                    keepAlive = false;
                    break;
                default:
                    System.out.println("Vælg venligst en gyldig mulighed.\n");
                    break;
            }
        }
    }

}
