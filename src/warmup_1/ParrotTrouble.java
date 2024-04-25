package warmup_1;

import java.util.Scanner;

public class ParrotTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a boolean(false, true) and a integer");
        boolean b = sc.nextBoolean();
        int a = sc.nextInt();
        System.out.println(parrotTrouble(b, a));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

}
