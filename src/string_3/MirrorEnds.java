package string_3;

public class MirrorEnds {
    public String mirrorEnds(String string){
        int len=string.length();
        String res="";
        String temp="";
        for (int i = 0; i < len; i++) {
            temp+=string.charAt(len-1-i);
            if(string.substring(0,i+1).equalsIgnoreCase(temp)){
                res=temp;
            }
        }
        return res;
    }
}
