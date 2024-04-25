package logic_1;

import static base.Base.sc;

public class InOrderEqual {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean equalOk = sc.nextBoolean();
        System.out.println(inOrderEqual(a, b, c, equalOk));
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c) return true;
        return equalOk && (a == b && c > b || b == c && a < b || a == b && b == c);
    }
}
