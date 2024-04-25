package logic_1;

import static base.Base.sc;

public class MaxMod5 {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(maxMod5(a, b));
    }

    public static int maxMod5(int a, int b) {
        if (a == b) return 0;
        return a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b);
    }
}
