package 数据结构;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Lis接口extend collection接口
 *1.有序
 * 2.有索引
 * 3.允许重复
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);//重写了tostring方法

        list.add(3, "zhang");
        System.out.println(list);

        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        list.set(4,"A");
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            
        }

        for (String s : list) {
            System.out.println(s);
        }

       /* String s = list.get(10);
        System.out.println(s);*/
    }
}
