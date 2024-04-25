package warmup_1;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers(int type) and a boolean(false or true)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean n = sc.nextBoolean();
        System.out.println(posNeg(a, b, n));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        return (a > 0 && b < 0 && !negative) || (a < 0 && b > 0 && !negative) || (a < 0 && b < 0 && negative);
    }

}
