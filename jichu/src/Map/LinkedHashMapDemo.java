package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a", "a");
        hashMap.put("c", "c");
        hashMap.put("b", "b");
        hashMap.put("a", "d");
        System.out.println(hashMap);//key不允许重复,无序

        LinkedHashMap<String,String> linked =new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked);//key不允许重复,有序
    }

}
