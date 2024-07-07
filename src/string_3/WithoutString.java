package string_3;

import java.util.HashMap;
import java.util.Map;

public class WithoutString {
    public String withoutString(String base, String remove){
        int lenBase=base.length();
        int lenRemove=remove.length();
        String lowCBase=base.toLowerCase();
        String lowCRemove=remove.toLowerCase();
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < lenBase; i++) {
            if (i <= lenBase - lenRemove) {
                String temp = lowCBase.substring(i, i + lenRemove);
                if (!temp.equals(lowCRemove)) {
                    res.append(base.charAt(i));
                } else {
                    i += lenRemove - 1;
                }
            }else{
                String temp=lowCBase.substring(i,i+1);
                if(!temp.equals(lowCRemove)){
                    res.append(base.charAt(i));
                }
            }
        }
        return res.toString();
    }
}
