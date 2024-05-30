package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            boolean b = false;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j]) && i != j) {
                    b = true;
                    break;
                }
            }
            map.put(strings[i], b);
        }
        return map;
    }
}
