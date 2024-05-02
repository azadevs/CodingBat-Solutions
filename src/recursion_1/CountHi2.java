package recursion_1;

public class CountHi2 {
    public static void main(String[] args) {
        System.out.println(countHi2("axhihixi"));
    }

    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        return str.startsWith("xhi") ? countHi2(str.substring(3)) : str.startsWith("hi") ? 1 + countHi2(str.substring(2)) : countHi2(str.substring(1));
    }
}
