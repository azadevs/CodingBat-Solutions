package logic_1;

import static base.Base.sc;

public class DateFashion {
    public static void main(String[] args) {
        int you = sc.nextInt();
        int date = sc.nextInt();
        System.out.println(dateFashion(you, date));
    }

    public static int dateFashion(int you, int date) {
        return ((you >= 8 || date >= 8) && (date != 2 && you != 2)) ? 2 : (you <= 2 || date <= 2) ? 0 : 1;
    }
}
