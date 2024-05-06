package map;

import java.util.Map;

import static base.Base.getMap;

public class Topping1 {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
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
