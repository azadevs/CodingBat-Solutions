package logic_1;

import static base.Base.sc;

public class RedTicket {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(redTicket(a, b, c));
    }

    public static int redTicket(int a, int b, int c) {
        return a == 2 && b == 2 && c == 2 ? 10 : (a == b && b == c ? 5 : a != b && a != c ? 1 : 0);
    }
}
