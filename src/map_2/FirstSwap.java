package map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder prevChars = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            if (map.containsKey(firstChar) && !prevChars.toString().contains(String.valueOf(firstChar))) {
                int prevIndex = map.get(firstChar);
                String temp = strings[prevIndex];
                strings[prevIndex] = strings[i];
                strings[i] = temp;
                map.remove(firstChar);
                prevChars.append(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }

}
