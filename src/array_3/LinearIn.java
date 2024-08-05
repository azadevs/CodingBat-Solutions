package array_3;

import java.util.Arrays;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        boolean b = false;
        for (int i : inner) {
            for (int j : outer) {
                if (i == j) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
            }
            if (!b) return false;
        }
        return true;
    }
}
