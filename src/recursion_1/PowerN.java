package recursion_1;

import static base.Base.sc;

public class PowerN {
    public static void main(String[] args) {
        int base = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerN(base, n));
    }

    public static int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }
}
