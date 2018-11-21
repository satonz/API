package Thread;

public class ticket {
    public static void main(String[] args) {
        RunAbleImpl runAble = new RunAbleImpl();
        Thread t1 = new Thread(runAble);
        Thread t2 = new Thread(runAble);
        Thread t3 = new Thread(runAble);
        t1.start();
        t2.start();
        t3.start();
    }
}
