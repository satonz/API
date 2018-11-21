package Collection;

import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {
      //  demo01();
        demo02();
    }

    private static void demo02() {
        Map map = new HashMap();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");

        Iterator iterator =map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

    }

    private static void demo01() {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
