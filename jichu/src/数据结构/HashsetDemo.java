package 数据结构;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("zhang");
        hashSet.add("zhang");
        hashSet.add("ting");
        hashSet.add(null);
        System.out.println(hashSet);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
