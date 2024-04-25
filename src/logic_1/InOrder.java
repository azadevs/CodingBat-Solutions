package logic_1;

import static base.Base.sc;

public class InOrder {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean bOk = sc.nextBoolean();
        System.out.println(inOrder(a, b, c, bOk));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return b > a && c > b && !bOk || bOk && c > b;
    }
}
