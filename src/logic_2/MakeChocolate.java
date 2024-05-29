package logic_2;

import static base.Base.sc;

public class MakeChocolate {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(makeChocolate(a, b, c));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int res;
        if (goal >= 5 * big) {
            res = goal - 5 * big;
        } else {
            res = goal - 5 * (goal / 5);
        }
        if (small >= res) return res;
        return -1;
    }

}
