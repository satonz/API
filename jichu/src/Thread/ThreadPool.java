package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.submit(new Runimpl());
        ex.shutdown();
        ex.submit(new Runimpl());
    }
}
