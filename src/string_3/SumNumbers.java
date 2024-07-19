package string_3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder temp= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp.append(str.charAt(i));
            } else {
                if (!temp.toString().isEmpty()) {
                    sum += Integer.parseInt(temp.toString());
                    temp=new StringBuilder();
                }
            }
        }
       return (!temp.toString().isEmpty()) ? sum + Integer.parseInt(temp.toString()) : sum;
    }
}
