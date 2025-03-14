package Multi.Synchronized;
import static Multi.Synchronized.Main.firstList;

public class SecondFlow extends Thread{
    private synchronized void counter(){
        firstList++;
    }
    @Override
    public void run() {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++){
            counter();
        }

        long end = System.currentTimeMillis();

        int time = (int) (end - start);

        System.out.println("second: " + firstList);
        System.out.println("time program(ms2): " + time);
    }
}
