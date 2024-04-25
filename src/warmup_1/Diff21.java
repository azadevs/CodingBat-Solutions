package warmup_1;

import java.util.Scanner;

public class Diff21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(diff21(n));
    }

    public static int diff21(int n) {
        int difference = Math.abs(21 - n);
        return n > 21 ? 2 * difference:difference;
    }
}
