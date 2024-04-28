package recursion_1;

import static base.Base.sc;

public class BunnyEars2 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(bunnyEars2(n));
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return bunnies;
        else if (bunnies == 1) return 2;
        return bunnies % 2 == 0 ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1);
    }
}
