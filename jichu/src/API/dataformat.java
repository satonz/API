package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dataformat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    private static void demo02() throws ParseException {
        String s ="1996年05月16日13时02分12秒";
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        System.out.println(simpleDateFormat.parse(s));
    }

    private static void demo01() {
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}
