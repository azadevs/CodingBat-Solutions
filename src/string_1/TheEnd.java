package string_1;

import java.util.Scanner;

public class TheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean front = sc.nextBoolean();
        System.out.println(theEnd(str, front));
    }

    public static String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
}
