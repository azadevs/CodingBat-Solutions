package warmup_1;

import java.util.Scanner;

public class Close10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(close10(a, b));
    }

    public static int close10(int a, int b) {
        int minusA = Math.abs(a - 10);
        int minusB = Math.abs(b - 10);
        if (minusA > minusB) {
            return a;
        } else if (minusA < minusB) {
            return b;
        }
        return 0;
    }

}
