package string_2;

import static base.Base.sc;

public class CatDog {
    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(catDog(str));
    }

    public static boolean catDog(String str) {
        int countD = 0;
        int countC = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("cat")) countC++;
            else if (str.substring(i).startsWith("dog")) countD++;
        }
        return countC == countD;
    }
}
