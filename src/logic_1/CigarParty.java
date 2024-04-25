package logic_1;

import static base.Base.sc;

public class CigarParty {
    public static void main(String[] args) {
        int cigars = sc.nextInt();
        boolean isWeekend = sc.nextBoolean();
        System.out.println(cigarParty(cigars, isWeekend));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend & cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60);
    }
}
