package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Base {
    public static Scanner sc = new Scanner(System.in);


    public static int[] getArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = new Random().nextInt(10);
        }
        return arr;
    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(sc.nextLine(), sc.next());
        }
        return map;
    }
}
