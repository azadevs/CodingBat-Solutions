package warmup_1;

import java.util.Scanner;

public class In3050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(in3050(a, b));
    }

    public static boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }
}
