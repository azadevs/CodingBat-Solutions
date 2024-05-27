package logic_2;

import static base.Base.sc;

public class RoundSum {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(roundSum(a, b, c));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int n) {
        if (n % 10 >= 5) return (n + 10 - n % 10);
        else return (n - n % 10);
    }
}
