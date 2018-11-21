package 数据结构;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashsetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("zhang");
        set.add("ting");
        set.add("qiang");
//        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
