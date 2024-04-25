package logic_1;

import static base.Base.sc;

public class FizzString {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(fizzString(str));
    }

    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        else if (str.startsWith("f")) return "Fizz";
        else if (str.endsWith("b")) return "Buzz";
        else return str;
    }
}
