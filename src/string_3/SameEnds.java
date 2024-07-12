package string_3;

public class SameEnds {
    public String sameEnds(String string) {
        int max = 0;
        int index = 0;
        int len=string.length();
        for (int i = 0; i <=len/2; i++) {
            String temp = string.substring(0, i);
            if (string.endsWith(temp) && max < temp.length()) {
                max = temp.length();
                index = i;
            }
        }
        return string.substring(0,index);
    }
}
