package warmup_1;

import java.util.Scanner;

public class EndUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(endUp(str));
    }

    public static String endUp(String str) {
        int len = str.length();
        if (len <= 3) return str.toUpperCase();
        return str.substring(0, len - 3) + str.substring(len - 3).toUpperCase();
    }

}
