package logic_2;

import static base.Base.sc;

public class MakeBricks {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(makeBricks(a, b, c));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int s;
        if (goal >= 5 * big) {
            s = goal - 5 * big;
        } else {
            s = goal - 5 * (goal / 5);
        }
        return small >= s;
    }
}
