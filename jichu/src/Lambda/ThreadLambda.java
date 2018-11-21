package Lambda;

public class ThreadLambda {
    public static void main(String[] args) {
        RunableImpl run = new RunableImpl();
        Thread thread = new Thread(run);
        thread.start();

        //简化代码  匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        };

        new Thread(r).start();

        //继续简化

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();



    }
}
