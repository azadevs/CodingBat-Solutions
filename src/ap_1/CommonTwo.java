package ap_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        Set<String> stringSetA = new HashSet<>(Arrays.asList(a));
        Set<String> stringSetB = new HashSet<>(Arrays.asList(b));
        stringSetA.retainAll(stringSetB);
        return stringSetA.size();
    }

}
