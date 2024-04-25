package warmup_1;

import java.util.Scanner;

public class StartHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(startHi(str));
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
