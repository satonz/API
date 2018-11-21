package Thread;

/**
 * 保证等待和唤醒只有一个执行必须用到同步代码块
 *
 */
public class notifyDemo {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (o) {
                    System.out.println("告知老板包子种类");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("开吃");
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o) {
                    System.out.println("五秒钟做好包子,告知顾客");
                    o.notify();//唤醒等待线程
                }
            }
        }.start();
    }
}
