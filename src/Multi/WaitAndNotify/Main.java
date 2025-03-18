package Multi.WaitAndNotify;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread firstFread = new Thread(() -> {
            try {
                waitAndNotify.produser();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread secondFread = new Thread(waitAndNotify::consumer);

        firstFread.start();
        secondFread.start();

        firstFread.join();
        secondFread.join();
    }
}