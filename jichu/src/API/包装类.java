package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class 包装类 {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
        demo03();
        demo04();

    }

    private static void demo04() {
        /**
         * 基本类型与字符串类型的转换
         */
        Integer in = 1;
        String s = in.toString();
        String s1 = String.valueOf(in);
        System.out.println(s);

        String st = "123";
        int i = Integer.parseInt(st);
        System.out.println(i);

    }

    private static void demo03() {
        /**
         * 自动装箱与拆箱
         */
        Integer in = 1;


        /**
         * 自动拆箱
         * 此处相当于in.intvalue()+2
         *
         */
        in = in + 2;


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i = list.get(0);
        System.out.println(i);
    }

    private static void demo02() {
        Integer in = Integer.valueOf(3);
        System.out.println(in);
    }

    private static void demo01() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String s = "19960516032121";
        System.out.println(simpleDateFormat.parse(s));
    }

}

