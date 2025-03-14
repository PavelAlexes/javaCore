package Multi.Volatile;
class Test extends Thread{
    private volatile boolean flag = true;
    public void run(){
        while (flag) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void stopRun(){
        flag = false;
    }
}
