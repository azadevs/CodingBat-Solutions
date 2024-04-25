package warmup_1;

import java.util.Scanner;

public class StartOz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(startOz(str));
    }

    public static String startOz(String str) {
        if (str.length() < 1) return "";
        return str.startsWith("oz") ? "oz" :
                str.startsWith("o") ? "o" :
                        str.substring(1).startsWith("z") ? "z"
                                : "";
    }
}
