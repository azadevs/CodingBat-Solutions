package functional_1;

import java.util.List;
import java.util.stream.Collectors;

import static base.Base.getList;

public class Doubling {
    public static void main(String[] args) {
        System.out.println(doubling(getList()));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
