package warmup_1;

import java.util.Scanner;

public class Max1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max1020(a, b));
    }

    public static int max1020(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max >= 10 && max <= 20) return max;
        else if (min >= 10 && min <= 20) return min;
        return 0;
    }
}
