package warmup_1;

import java.util.Scanner;

public class MixStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(mixStart(str));
    }

    public static boolean mixStart(String str) {
        if (str.length() < 3) return false;
        return str.substring(1).startsWith("ix");
    }
}
