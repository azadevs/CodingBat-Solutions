package logic_1;

import static base.Base.sc;

public class AlarmClock {
    public static void main(String[] args) {
        int day = sc.nextInt();
        boolean vacation = sc.nextBoolean();
        System.out.println(alarmClock(day, vacation));
    }

    public static String alarmClock(int day, boolean vacation) {
        if (day >= 1 && day <= 5) {
            if (vacation) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else if (day == 6 || day == 0) {
            if (vacation) {
                return "off";
            } else {
                return "10:00";
            }
        }
        return "10:00";
    }
}
