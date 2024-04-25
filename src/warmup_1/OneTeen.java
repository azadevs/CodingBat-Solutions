package warmup_1;

import java.util.Scanner;

public class OneTeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(loneTeen(a, b));
    }

    public static boolean loneTeen(int a, int b) {
        return ((a >= 13 && a <= 19) && (b < 13 || b > 19)) || ((a < 13 || a > 19) && (b >= 13 && b <= 19));
    }
}
