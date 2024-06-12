package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(e -> e >= 0).collect(Collectors.toList());
    }
}
