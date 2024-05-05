package map;

import java.util.HashMap;
import java.util.Map;

import static base.Base.sc;

public class MapShare {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(sc.next(), sc.next());
        }
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
