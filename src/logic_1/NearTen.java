package logic_1;

import static base.Base.sc;

public class NearTen {
    public static void main(String[] args) {
        int num = sc.nextInt();
        System.out.println(nearTen(num));
    }

    public static boolean nearTen(int num) {
        int mod = num % 10;
        return 10 - mod == 1 || 10 - mod == 2 || mod == 2 || mod == 1 || mod == 0;
    }
}
