package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhang", 1);
        map.put("ting", 2);
        map.put("qiang", 3);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println("key:"+key+"    "+"value:"+value);
        }
    }
}
