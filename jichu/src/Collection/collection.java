package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Collection<String> coll=new ArrayList<>();
        System.out.println(coll);
        boolean add = coll.add("zhang");
        System.out.println(add);
        coll.add("lisi");
        System.out.println(coll);
        boolean remove = coll.remove("zhang");
        System.out.println(coll);
        boolean remove1 = coll.remove("156");
        System.out.println(remove1);
        boolean lisi = coll.contains("lisi");
        System.out.println(lisi);
    }
}
