package recursion_1;

import static base.Base.sc;

public class Triangle {
    public static void main(String[] args) {
        int rows = sc.nextInt();
        System.out.println(triangle(rows));
    }

    public static int triangle(int rows) {
        if (rows == 0 || rows == 1) return rows;
        return rows + triangle(rows - 1);
    }
}
