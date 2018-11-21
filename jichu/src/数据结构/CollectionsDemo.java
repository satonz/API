package 数据结构;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
//        demo01();

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "zhang", "ting", "qiang");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(2) - o2.charAt(2);
            }
        });

        System.out.println(arrayList);
    }

    private static void demo01() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 5, 55, 21, 5, 42, 1);
        System.out.println(arrayList);
        /*
        打乱顺序
         */
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
