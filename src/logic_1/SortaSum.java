package logic_1;


import static base.Base.sc;

public class SortaSum {
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sortaSum(a, b));
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 19 ? 20 : sum;
    }
}
