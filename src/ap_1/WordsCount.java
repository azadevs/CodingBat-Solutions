package ap_1;

public class WordsCount {
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String e : words) {
            if (e.length() == len) count++;
        }
        return count;
    }
}
