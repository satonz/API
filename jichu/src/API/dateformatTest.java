package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算一个人出生了多少天
 */
public class dateformatTest {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
//        String s = "19960516";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        long mm = simpleDateFormat.parse(next).getTime();
        System.out.println(mm);
        Date date = new Date();
        long now = date.getTime();
        System.out.println(now);
        long d = now-mm;
        System.out.println(d);
        System.out.println(d/86400/1000);

    }
}
