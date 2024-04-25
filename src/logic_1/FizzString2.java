package logic_1;

import static base.Base.sc;

public class FizzString2 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(fizzString2(n));
    }

    public static String fizzString2(int n) {
        if (n % 3 != 0 && n % 5 != 0) return n + "!";
        else if (n % 3 == 0 && n % 5 != 0) return "Fizz!";
        else if (n % 3 != 0) return "Buzz!";
        else return "FizzBuzz!";
    }
}
