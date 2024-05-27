package logic_2;

import static base.Base.sc;

public class BlackJack {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(blackJack(a, b));
    }

    public static int blackJack(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max <= 21) return max;
        else if (min <= 21) return min;
        else return 0;
    }
}
