package warmup_1;

import java.util.Scanner;

public class MonkeyTrouble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (true or false)");
        boolean a, b;
        a = sc.nextBoolean();
        b = sc.nextBoolean();
        System.out.println(monkeyTrouble(a, b));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

}
