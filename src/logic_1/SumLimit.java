package logic_1;

import static base.Base.sc;

public class SumLimit {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumLimit(a, b));
    }


    public static int sumLimit(int a, int b) {
        String sum = String.valueOf(a + b);
        String strA = String.valueOf(a);
        return sum.contains(strA) ? a : sum.length() > strA.length() ? a : Integer.parseInt(sum);
    }
}
