package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, (map.get(string) + 1));
            } else {
                map.put(string, 1);
            }
            if (map.get(string) % 2 == 0) {
                result.append(string);
            }
        }
        return result.toString();
    }
}
