package Multi.WaitAndNotify;

import java.util.Scanner;

public class WaitAndNotify {

    public void produser() throws InterruptedException {

        synchronized (this){
            System.out.println("First fread start!");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("First fread waiting second fread!");

            wait();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("First fread continues to work!");
        }
    }

    public void consumer(){

        synchronized (this){
            Scanner scanner = new Scanner(System.in);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("\nSecond fread start!");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Press 'Enter' to continue!");


            scanner.nextLine();

            notify();
        }
    }
}
