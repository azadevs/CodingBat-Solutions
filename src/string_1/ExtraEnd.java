package string_1;


import static base.Base.sc;

public class ExtraEnd {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(extraEnd(str));
    }

    public static String extraEnd(String str) {
        int len = str.length();
        return len < 3 ? str + str + str :
                str.substring(len - 2) + str.substring(len - 2) + str.substring(len - 2);
    }
//        If your JDK version is above 11 - you will use the repeat method
//        return len < 3 ? str + str + str : str.substring(len - 2).repeat(3);
}
