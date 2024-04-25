package warmup_1;

import java.util.Scanner;

public class MissingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(missingChar(str, n));
    }

    public static String missingChar(String str, int n) {
        String c = String.valueOf(str.charAt(n));
        return str.replace(c, "");
    }

}
