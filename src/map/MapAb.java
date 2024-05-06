package map;

import java.util.Map;

import static base.Base.getMap;

public class MapAb {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(mapAB(map));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
