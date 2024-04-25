package warmup_1;

import java.util.Scanner;

public class Or35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(or35(n));
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
