package string_1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(helloName(name));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
