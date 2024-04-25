package logic_1;


import static base.Base.sc;

public class CaughtSpeeding {
    public static void main(String[] args) {
        int speed = sc.nextInt();
        boolean isBirthday = sc.nextBoolean();
        System.out.println(caughtSpeeding(speed, isBirthday));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday && speed <= 65 || !isBirthday && speed <= 60) {
            return 0;
        } else if (isBirthday && speed <= 85 || !isBirthday && speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
}
