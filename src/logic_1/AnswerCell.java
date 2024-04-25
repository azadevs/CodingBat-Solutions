package logic_1;

import static base.Base.sc;

public class AnswerCell {
    public static void main(String[] args) {
        boolean isMorning = sc.nextBoolean();
        boolean isMom = sc.nextBoolean();
        boolean isAsleep = sc.nextBoolean();
        System.out.println(answerCell(isMorning, isMom, isAsleep));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        else if (isMom) return true;
        else return !isMorning;
    }
}
