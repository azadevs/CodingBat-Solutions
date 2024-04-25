package warmup_1;

import java.util.Scanner;

public class DelDel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(delDel(str));
    }

    public static String delDel(String str) {
        if (str.length() <= 3) return str;
        return str.substring(1).startsWith("del") ? str.replace("del", "") : str;
    }
}
