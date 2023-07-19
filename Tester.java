package Java001;

public class Tester {
    public static void main(String[] args) {

        Counter p = new Counter("A");
        Thread pThread = new Thread(p);
        Counter q = new Counter("B");
        Thread qThread = new Thread(q);
        Counter r = new Counter("C");
        Thread rThread = new Thread(r);
        pThread.start();
        qThread.start();
        rThread.start();



    }
}