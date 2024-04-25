package logic_1;

import static base.Base.sc;

public class LastDigit {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(lastDigit(a, b, c));
    }

    public static boolean lastDigit(int a, int b, int c) {
        int modA = a % 10;
        int modB = b % 10;
        int modC = c % 10;
        return modA == modB || modB == modC || modA == modC;
    }
}
