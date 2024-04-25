package warmup_1;

import java.util.Scanner;

public class In1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(in1020(a, b));
    }

    public static boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;
    }

}
