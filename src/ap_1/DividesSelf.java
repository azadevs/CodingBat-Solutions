package ap_1;

public class DividesSelf {
    public boolean dividesSelf(int n) {
        int tempN = n;
        while (n != 0) {
            int digit = n % 10;
            if (digit==0 || tempN % digit != 0) return false;
            n /= 10;
        }
        return true;
    }
}
