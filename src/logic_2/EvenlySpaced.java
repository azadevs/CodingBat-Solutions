package logic_2;

import static base.Base.sc;

public class EvenlySpaced {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(evenlySpaced(a, b, c));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = max != a && min != a ? a : max != b && min != b ? b : c;
        return mid - min == max - mid;
    }
}
