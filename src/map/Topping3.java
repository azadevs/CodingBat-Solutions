package map;

import java.util.Map;

import static base.Base.getMap;

public class Topping3 {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(topping3(map));
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}
