package recursion_1;

import static base.Base.sc;

public class BunnyEars {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(bunnyEars(n));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies == 1) return 2;
        return 2 + bunnyEars(bunnies - 1);
    }
}
