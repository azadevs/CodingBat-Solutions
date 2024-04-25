package logic_1;

import static base.Base.sc;

public class TeenSum {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(teenSum(a, b));
    }

    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }
        return a + b;
    }
}
