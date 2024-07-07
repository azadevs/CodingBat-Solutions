package string_3;

public class GHappy {
    public boolean gHappy(String str) {
        if(!str.contains("g")) return true;
        boolean bool = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                bool = i!=str.length()-1 && str.charAt(i + 1) == 'g' || i > 0 && str.charAt(i - 1) == 'g';
            }
        }
        return bool;
    }
}
