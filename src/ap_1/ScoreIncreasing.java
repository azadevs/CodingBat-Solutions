package ap_1;

public class ScoreIncreasing {
    public boolean scoreIncreasing(int[] scores) {
        boolean bool = false;
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i + 1] >= scores[i]) {
                bool = true;
            } else {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
