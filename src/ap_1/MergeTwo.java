package ap_1;

public class MergeTwo {

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] strings = new String[n];
        int ai = 0;
        int bi = 0;
        for (int i = 0; i < n; i++) {
            if (a[ai].compareTo(b[bi]) < 0) {
                strings[i] = a[ai];
                ai++;
            } else if (a[ai].compareTo(b[bi]) > 0) {
                strings[i] = b[bi];
                bi++;
            } else {
                strings[i] = a[ai];
                ai++;
                bi++;
            }
        }
        return strings;
    }

}
