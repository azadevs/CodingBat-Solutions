package string_3;

public class CountYZ {
    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y')) count++;
        }
        if (str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'z') count++;
        return count;
    }
}
