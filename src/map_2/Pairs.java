package map_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {


    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String e : strings) {
            map.put(e.substring(0, 1), e.substring(e.length() - 1));
        }
        return map;
    }


}
