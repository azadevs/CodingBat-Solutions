package ap_1;

public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int len = key.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (key[i].equals(answers[i])) res += 4;
            else if (!answers[i].equals("?") && !key[i].equals(answers[i])) res += -1;
        }
        return res;
    }
}
