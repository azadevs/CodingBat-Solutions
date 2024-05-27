package logic_2;

import static base.Base.sc;

public class LoneSum {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(loneSum(a, b, c));
    }

    public static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b || a == c) sum -= a;
        if (b == a || b == c) sum -= b;
        if (c == a || c == b) sum -= c;
        return sum;
    }
}
