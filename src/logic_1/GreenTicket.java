package logic_1;

import static base.Base.sc;

public class GreenTicket {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(greenTicket(a,b,c));
    }

    public static int greenTicket(int a, int b, int c) {
        return a != b && b != c && a != c ? 0 : a == b && b == c ? 20 : (a == b || a == c ? 10 : 0);
    }
}
