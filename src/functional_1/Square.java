package functional_1;

import java.util.List;
import java.util.stream.Collectors;

import static base.Base.getList;

public class Square {
    public static void main(String[] args) {
        List<Integer> nums = getList();
        System.out.println("Before");
        System.out.println(nums);

        System.out.println("After");
        System.out.println(square(nums));
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(e -> e * e).collect(Collectors.toList());
    }
}
