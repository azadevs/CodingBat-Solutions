package logic_1;

import static base.Base.sc;

public class In1To10 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean outsideMode = sc.nextBoolean();
        System.out.println(in10To10(n, outsideMode));
    }

    public static boolean in10To10(int n, boolean outsideMode) {
        if (n == 9 && !outsideMode) return false;
        if (n >= 1 && n <= 10) return true;
        else return outsideMode;
    }
}
