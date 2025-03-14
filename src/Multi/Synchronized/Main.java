package Multi.Synchronized;

import java.util.*;

public class Main extends Thread{

    public static int firstList;

//    public static Object firstLock = new Object();
//    public static Object secondLock = new Object();
//    public List<Integer> secondList = new ArrayList<>();
public static void main(String[] args) throws InterruptedException {
    Main main = new Main();
    main.doWork();

    FirstFlow firstFlow = new FirstFlow();
    SecondFlow secondFlow = new SecondFlow();

    firstFlow.start();
    secondFlow.start();

    firstFlow.join();
    secondFlow.join();

    System.out.println(firstList);

}

    private synchronized void counter(){
        firstList++;
    }

    public void doWork() throws InterruptedException {
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 10000; i++){
                    counter();
                }
                long end = System.currentTimeMillis();

                int time = (int) (end - start);

                System.out.println("first: " + firstList);
                System.out.println("time program(ms1): " + time);
            }
        });

        Thread second = new Thread(new Runnable() {
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
        });

        first.start();
        second.start();

        first.join();
        second.join();
    }
}


