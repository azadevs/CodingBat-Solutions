package map;

import java.util.HashMap;
import java.util.Map;

import static base.Base.sc;

public class MapAb {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(sc.next(), sc.next());
        }
        System.out.println(mapAB(map));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
