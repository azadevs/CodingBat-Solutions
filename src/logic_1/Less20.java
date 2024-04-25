package logic_1;

import static base.Base.sc;

public class Less20 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(less20(n));
    }

    public static boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }
}
