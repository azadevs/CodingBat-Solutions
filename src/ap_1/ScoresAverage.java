package ap_1;

public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int firsHalf = average(scores, 0, scores.length / 2);
        int secondHalf = average(scores, scores.length / 2, scores.length);
        return Math.max(firsHalf, secondHalf);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (scores.length / 2);
    }
}
