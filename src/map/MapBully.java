package map;

import java.util.Map;

import static base.Base.getMap;

public class MapBully {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(mapBully(map));
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
