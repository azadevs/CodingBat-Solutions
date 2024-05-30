package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int count = 0;
            for (String string : strings) {
                if (s.equals(string)) {
                    count++;
                }
            }
            map.put(s, count);
        }
        return map;
    }

}
