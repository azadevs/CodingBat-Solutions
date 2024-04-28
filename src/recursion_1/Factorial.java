package recursion_1;

import static base.Base.sc;

public class Factorial {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }
}
