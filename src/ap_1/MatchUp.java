package ap_1;

public class MatchUp {
    public int matchUp(String[] a, String[] b) {
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if((!a[i].isEmpty() && !b[i].isEmpty()) && a[i].charAt(0)==b[i].charAt(0)) count++;
        }
        return count;
    }
}
