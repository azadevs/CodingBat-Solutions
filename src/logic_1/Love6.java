package logic_1;

import static base.Base.sc;

public class Love6 {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(love6(a, b));
    }

    public static boolean love6(int a, int b) {
        return a + b == 6 || a == 6 || b == 6 || Math.abs(a - b) == 6;
    }
}
