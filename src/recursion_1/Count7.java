package recursion_1;

import static base.Base.sc;

public class Count7 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(count7(n));
    }

    public static int count7(int n) {
        if (n == 0) return 0;
        return n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
    }
}
