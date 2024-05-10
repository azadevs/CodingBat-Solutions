package string_2;

import static base.Base.sc;

public class CountHi {
    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(countHi(str));
    }

    public static int countHi(String str) {
        // 1-Solve
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("hi")) count++;
        }
        return count;

        // 2-Solve
//        if (str.length() < 2) return 0;
//        else if (str.length() == 2 && str.startsWith("hi")) return 1;
//        return str.startsWith("hi") ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
    }
}
