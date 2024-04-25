package warmup_1;

import java.util.Scanner;

public class Front22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(front22(str));
    }

    public static String front22(String str) {
        int len = str.length();
        if (len < 2) {
            return str + str + str;
        }
        String firstTwoChars = str.substring(0, 2);
        return firstTwoChars + str + firstTwoChars;
    }

}
