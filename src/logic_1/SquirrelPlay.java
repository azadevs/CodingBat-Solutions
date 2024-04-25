package logic_1;

import static base.Base.sc;

public class SquirrelPlay {
    public static void main(String[] args) {
        int temp = sc.nextInt();
        boolean isSummer = sc.nextBoolean();
        System.out.println(squirrelPlay(temp, isSummer));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return (isSummer && temp >= 60 && temp <= 100) || (!isSummer && temp >= 60 && temp <= 90);
    }
}
