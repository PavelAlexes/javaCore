package Polymorphism.first;

public class Main {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        boolean flag = false;
        while (!flag) {
            System.out.println("Rock or PopMusic?");
            player.playMusicPlayer();
        }


    }
}

