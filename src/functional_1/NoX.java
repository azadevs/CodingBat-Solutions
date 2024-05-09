package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add("asxax" + i);
        }
        System.out.println(noX(strings));
    }

    public static List<String> noX(List<String> strings) {
        return strings.stream().map(e -> e.replace("x", "")).collect(Collectors.toList());
    }

}
