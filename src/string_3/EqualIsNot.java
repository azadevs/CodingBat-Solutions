package string_3;

public class EqualIsNot {
    public boolean equalIsNot(String str){
        int count=0;
        int len=str.length();
        for (int i = 0; i < len; i++) {
            if(i<=len-2){
                String temp=str.substring(i,i+2);
                if(temp.equals("is")) count++;
            }
            if(i<=len-3){
                String temp=str.substring(i,i+3);
                if(temp.equals("not")) count--;
            }
        }
        return count==0;
    }
}
