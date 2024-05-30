package map_2;

import java.util.HashMap;
import java.util.Map;

import static base.Base.sc;

public class Word0 {

    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Hi" + i;
        }
        System.out.println(word0(strings));
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, 0);
        }
        return map;
    }
}
