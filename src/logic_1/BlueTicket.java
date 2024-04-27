package logic_1;

import static base.Base.sc;

public class BlueTicket {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(blueTicket(a, b, c));
    }

    public static int blueTicket(int a, int b, int c) {
        int sumAB = a + b;
        int sumBC = b + c;
        int sumAC = a + c;
        return sumAB == 10 || sumBC == 10 || sumAC == 10 ? 10 : sumAB - sumBC >= 10 || sumAB - sumAC >= 10 ? 5 : 0;
    }
}
