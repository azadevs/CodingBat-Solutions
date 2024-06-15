package ap_1;

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        StringBuilder newWords = new StringBuilder();
        for (String word : words) {
            if (!word.equals(target)) {
                newWords.append(word).append(",");
            }
        }
        return newWords.toString().split(",");
    }
}
