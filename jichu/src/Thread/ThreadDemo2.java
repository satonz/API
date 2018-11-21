package Thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"zhang");
            }
        }.start();



         new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"ting");
            }
        }).start();

    }
}
