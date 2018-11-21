package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunAbleImpl implements Runnable {

    private int ticket = 100;
    Object object = new Object();
    @Override
    public void run() {
        synchronized (object){
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张票");
                    ticket--;

                }
                if (ticket == 0) {
                    return;
                }
            }
        }
    }
}
