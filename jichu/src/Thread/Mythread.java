package Thread;

public class Mythread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("thread"+i);
        }
    }


}
