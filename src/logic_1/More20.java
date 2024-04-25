package logic_1;

import static base.Base.sc;

public class More20 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(more20(n));
    }

    public static boolean more20(int n) {
        int mod = n % 20;
        return mod == 1 || mod == 2;
    }
}
