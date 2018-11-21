package 数据结构;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);

        list.addFirst("zhang");
        System.out.println(list);

        list.push("zhang");
        System.out.println(list);

        list.addLast("ting");
        System.out.println(list);

        String first = list.getFirst();
        System.out.println(first);

        String last = list.getLast();
        System.out.println(last);

    }
}
