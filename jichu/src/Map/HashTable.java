package Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
hashmap可以存储null值null键
hashtable不可以存储null值null键  线程安全的
 */
public class HashTable {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("zhang", null);
        map.put(null, "zhang");
        map.put(null, null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable<>();
//        table.put("zhang", null);//java.lang.NullPointerException
//        table.put(null, "zhang");//java.lang.NullPointerException
//        table.put(null, null);//java.lang.NullPointerException
        System.out.println(table);

    }
}
