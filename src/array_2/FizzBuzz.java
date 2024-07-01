package array_2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] strings = new String[end - start];
        for (int i = start,j=0; i < end; i++) {
            if(i%3==0){
                if(i%5!=0){
                    strings[j++]="Fizz";
                }else{
                    strings[j++]="FizzBuzz";
                }
            }else if(i%5==0) strings[j++]="Buzz";
            else strings[j++]=String.valueOf(i);
        }
        return strings;
    }
}
