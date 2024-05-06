package map;

import java.util.Map;

import static base.Base.getMap;

public class MapAB3 {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(mapAB3(map));
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) map.put("b", map.get("a"));
        else if (map.containsKey("b") && !map.containsKey("a")) map.put("a", map.get("b"));
        return map;
    }
}
