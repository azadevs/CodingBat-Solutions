package warmup_1;

import java.util.Scanner;

public class Makes10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(makes10(a, b));
    }

    public static boolean makes10(int a, int b) {
        int sum = a + b;
        return sum == 10 || a == 10 || b == 10;
    }

}
