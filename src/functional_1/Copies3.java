package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add("Hi" + i);
        }
        System.out.println(copies3(strings));
    }

    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(e -> e + e + e).collect(Collectors.toList());
    }
}
