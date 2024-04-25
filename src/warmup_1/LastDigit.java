package warmup_1;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lastDigit(a, b));
    }

    public static boolean lastDigit(int a, int b) {
        int lastA = a % 10;
        int lastB = b % 10;
        return lastA == lastB;
    }
}
