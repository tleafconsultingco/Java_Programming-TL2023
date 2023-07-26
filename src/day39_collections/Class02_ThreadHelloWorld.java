package day39_collections;

public class Class02_ThreadHelloWorld extends Thread {

    int threadNumber;

    public Class02_ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(" Hello world " +i + " from Thread "+threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
