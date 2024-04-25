package logic_1;

import static base.Base.sc;

public class TwoAsOne {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(twoAsOne(a, b, c));
    }

    public static boolean twoAsOne(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        return (Math.abs(a) + Math.abs(b) + Math.abs(c)) - max == max;
    }
}
