package API;

import java.util.Date;

public class demoData {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(1541654072793l);
        System.out.println(date1);
        long time = date.getTime();
        System.out.println(time);

    }
}
