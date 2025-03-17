package Polymorphism.first;
import java.util.Scanner;

class MusicPlayer {

    public void playMusicPlayer() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        Music music;
        switch (string) {
            case "Rock": {
                music = new RockMusic("Rock");
                music.play();
            }
            break;
            case "PopMusic": {
                music = new PopMusic("PopMusic");
                music.play();
            }
            break;
        }
    }
}