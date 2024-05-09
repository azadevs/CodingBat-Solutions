package functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add("HEllo" + i);
        }
        System.out.println(lower(strings));
    }

    public static List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}
