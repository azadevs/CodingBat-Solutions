package warmup_1;

import java.util.Scanner;

public class SleepIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (true or false)");
        boolean w, v;
        w = sc.nextBoolean();
        v = sc.nextBoolean();
        System.out.println(sleepIn(w, v));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
