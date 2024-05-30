package map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            StringBuilder newValue = new StringBuilder();
            for (String e : strings) {
                if (s.charAt(0) == e.charAt(0)) {
                    newValue.append(e);
                }
            }
            map.put(s.substring(0, 1), newValue.toString());
        }
        return map;
    }

}
