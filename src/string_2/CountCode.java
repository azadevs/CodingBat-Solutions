package string_2;

public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
    }

    public static int countCode(String str) {
        if (str.length() < 4) return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("co") && str.substring(i + 3).startsWith("e")) {
                count++;
            }
        }
        return count;
    }
}
