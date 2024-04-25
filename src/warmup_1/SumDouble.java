package warmup_1;

import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumDouble(a, b));
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        return a == b ? 2 * sum : sum;
    }

}
