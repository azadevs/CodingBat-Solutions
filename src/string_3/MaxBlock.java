package string_3;

public class MaxBlock {
    public int maxBlock(String str) {
        int count = 1;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) count++;
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}
