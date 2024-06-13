package ap_1;

public class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        String[] newWords = new String[n];
        for (int i = 0; i < n; i++) {
            newWords[i] = words[i];
        }
        return newWords;
    }
}
