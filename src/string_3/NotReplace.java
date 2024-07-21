package string_3;

public class NotReplace {
    public String notReplace(String str) {
        str = " " + str + " ";
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            String temp = str.substring(i, i + 2);
            if (temp.equals("is") && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {
                newStr.append("is not");
                i++;
            } else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.substring(1);
    }

}

