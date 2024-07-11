package string_3;

public class SumDigits {
    public int sumDigits(String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
}
