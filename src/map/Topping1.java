package map;

import java.util.HashMap;
import java.util.Map;

import static base.Base.sc;

public class Topping1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(sc.next(), sc.next());
        }
        System.out.println(topping1(map));
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }
}
