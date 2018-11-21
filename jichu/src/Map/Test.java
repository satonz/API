package Map;

import java.security.Key;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s ="aaanknknaaajhsjsnxbxshcbsbsxjkbkax";
        char[] chars = s.toCharArray();
        int length = chars.length;
        System.out.println(length);

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            Integer value = map.get(c);
            System.out.println(c+"   "+value);
        }
    }
}
