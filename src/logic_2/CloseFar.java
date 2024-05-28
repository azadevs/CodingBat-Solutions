package logic_2;

import static base.Base.sc;

public class CloseFar {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(closeFar(a, b, c));
    }

    public static boolean closeFar(int a, int b, int c) {
        return Math.abs(b - c) >= 2 && (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 ||
                Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2);
    }
}
