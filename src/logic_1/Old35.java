package logic_1;

import static base.Base.sc;

public class Old35 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(old35(n));
    }

    public static boolean old35(int n) {
        return n % 3 == 0 && n % 5 != 0 || n % 5 == 0 && n % 3 != 0;
    }
}
