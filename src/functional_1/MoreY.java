package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add("Hi" + i);
        }
        System.out.println(moreY(strings));
    }

    public static List<String> moreY(List<String> strings) {
        return strings.stream().map(e -> "y" + e + "y").collect(Collectors.toList());
    }
}
