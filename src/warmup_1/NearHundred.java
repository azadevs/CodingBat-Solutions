package warmup_1;

import java.util.Scanner;

public class NearHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nearHundred(n));
    }

    public static boolean nearHundred(int n) {
        int a = Math.abs(100 - n);
        int b = Math.abs(200 - n);
        return a <= 10 && a >= 0 || b <= 10 && b >= 0;
    }

}
