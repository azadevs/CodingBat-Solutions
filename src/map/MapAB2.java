package map;

import java.util.Map;

import static base.Base.getMap;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        System.out.println(mapAB2(map));
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") & map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
