package 数据结构;

import java.text.SimpleDateFormat;
import java.util.*;

public class statck {
    public static void main(String[] args) {
        demo1();

    }

    private static void cal() {
        Date date = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }

    private static void demo1() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        List list = new LinkedList();
    }
}
