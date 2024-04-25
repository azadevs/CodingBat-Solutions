package logic_1;

import static base.Base.sc;

public class TeaParty {
    public static void main(String[] args) {
        int tea = sc.nextInt();
        int candy = sc.nextInt();
        System.out.println(teaParty(tea, candy));
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if (tea / 2 >= candy || candy / 2 >= tea) return 2;
        else return 1;
    }
}
