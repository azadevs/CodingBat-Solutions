package logic_1;

import static base.Base.sc;

public class SpecialEleven {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(specialEleven(n));
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
}
