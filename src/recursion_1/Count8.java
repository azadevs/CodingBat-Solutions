package recursion_1;

import static base.Base.sc;

public class Count8 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(count8(n));
    }

    public static int count8(int n) {
        if (n == 0) return 0;
        return n % 10 == 8 ? n / 10 % 10 == 8 ? 2 + count8(n / 10) : 1 + count8(n / 10) : count8(n / 10);
    }
}
