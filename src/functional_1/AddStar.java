package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            strings.add("He" + i);
        }
        System.out.println(addStar(strings));
    }

    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(e -> e + "*").collect(Collectors.toList());
    }
}
