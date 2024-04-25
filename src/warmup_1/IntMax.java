package warmup_1;

import java.util.Scanner;

public class IntMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(intMax(a, b, c));
    }

    public static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
