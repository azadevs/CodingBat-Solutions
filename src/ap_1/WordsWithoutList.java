package ap_1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public List<String> wordsWithoutList(String[] words, int len) {
        List<String> stringList = new ArrayList<>();
        for (String e : words) {
            if (e.length() != len) {
                stringList.add(e);
            }
        }
        return stringList;
    }
}
