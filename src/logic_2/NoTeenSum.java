package logic_2;

import static base.Base.sc;

public class NoTeenSum {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(noTeenSum(a, b, c));
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) return 0;
        return n;
    }
}
