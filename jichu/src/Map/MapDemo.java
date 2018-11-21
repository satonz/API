package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //demo01();
        Map<String, Integer> map = new HashMap<>();
        map.put("zhang", 1);
        map.put("ting", 2);
        map.put("qiang", 3);
        System.out.println(map);
        Set<String> set = map.keySet();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
            Integer integer = map.get(key);
            System.out.println(integer);
        }
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(value);
        }

    }

    private static void demo01() {
        Map<String,String> map = new HashMap<>();
        String put = map.put("zhang", "ting");
        String put1 = map.put("zhang", "ting");
        System.out.println(put1);

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            System.out.println(key);
            String value = next.getValue();
            System.out.println(value);
        }
    }
}
