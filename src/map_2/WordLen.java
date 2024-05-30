package map_2;

import java.util.HashMap;
import java.util.Map;

import static base.Base.sc;

public class WordLen {
    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Hello" + i;
        }
        System.out.println(wordLen(strings));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String e : strings) {
            map.put(e, e.length());
        }
        return map;
    }
}
