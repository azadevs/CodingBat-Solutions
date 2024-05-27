package logic_2;

import static base.Base.sc;

public class LuckySum {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(luckySum(a, b, c));
    }

    public static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) sum = 0;
        else if (b == 13) sum -= b + c;
        else if (c == 13) sum -= c;
        return sum;
    }
}
