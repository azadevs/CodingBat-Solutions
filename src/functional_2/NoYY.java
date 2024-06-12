package functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(e -> e + "y").filter(e -> !e.contains("yy")).collect(Collectors.toList());
    }
}
