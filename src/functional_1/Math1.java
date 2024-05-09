package functional_1;

import java.util.List;
import java.util.stream.Collectors;

import static base.Base.getList;

public class Math1 {
    public static void main(String[] args) {
        List<Integer> nums = getList();
        System.out.println("Before");
        System.out.println(nums);
        System.out.println("After");
        System.out.println(math1(nums));
    }

    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(e -> (e + 1) * 10).collect(Collectors.toList());
    }
}
