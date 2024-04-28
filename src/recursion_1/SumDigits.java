package recursion_1;

import static base.Base.sc;

public class SumDigits {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        if (n < 10) return n;
        return n % 10 + sumDigits(n / 10);
    }
}
