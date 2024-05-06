package map;

import java.util.Map;

import static base.Base.getMap;

public class MapShare {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(mapShare(map));
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
