package warmup_1;

import java.util.Scanner;

public class NotString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(notString(str));
    }

    public static String notString(String str) {
        return str.startsWith("not") ? str : "not" + str;
    }

}
