package Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        mt.start();

        Runabledemo runabledemo = new Runabledemo();
        Thread thread = new Thread(runabledemo);
        thread.start();


        for (int i = 0; i <20 ; i++) {
            System.out.println("main"+i);
        }
    }
}
