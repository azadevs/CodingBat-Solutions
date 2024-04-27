package logic_1;

import static base.Base.sc;

public class ShareDigit {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(shareDigit(a, b));
    }

    public static boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || b / 10 == a % 10;
    }
}
