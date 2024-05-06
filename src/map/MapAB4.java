package map;

import java.util.Map;

import static base.Base.getMap;

public class MapAB4 {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(mapAB4(map));
    }
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") & map.containsKey("b")) {
            if (map.get("a").length() != map.get("b").length()) {
                map.put("c", map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

}
