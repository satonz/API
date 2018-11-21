package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSavePerson {
    public static void main(String[] args) {
        demo2();
    }

    private static void demo2() {
        HashMap<person, String> map = new HashMap<>();
        map.put(new person("女王",18),"英国");
        map.put(new person("秦始皇",18),"中国");
        map.put(new person("普京",30),"俄罗斯");
        map.put(new person("女王",18),"毛里求斯");

        Set<Map.Entry<person, String>> set = map.entrySet();
        for (Map.Entry<person, String> entry : set) {
            person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);

        }
    }

    private static void demo1() {
        HashMap<String,person> map = new HashMap<>();
        map.put("北京", new person("张三", 18));
        map.put("上海", new person("李四", 19));
        map.put("广州", new person("王五", 20));
        map.put("北京", new person("赵六", 18));
        Set<String> set = map.keySet();
        for (String key : set) {
            person person = map.get(key);
            System.out.println(person);
        }
    }
}
