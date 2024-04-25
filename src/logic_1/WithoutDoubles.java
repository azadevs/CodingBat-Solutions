package logic_1;

import static base.Base.sc;

public class WithoutDoubles {
    public static void main(String[] args) {
        int die1 = sc.nextInt();
        int die2 = sc.nextInt();
        boolean noDoubles = sc.nextBoolean();
        System.out.println(withoutDoubles(die1, die2, noDoubles));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        return noDoubles && die1 == die2 ? sum >= 12 ? 7 : sum + 1 : sum;
    }
}
