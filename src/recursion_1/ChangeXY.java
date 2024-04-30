package recursion_1;

public class ChangeXY {
    public static void main(String[] args) {
        System.out.println(changeXY("Hellox"));
    }

    public static String changeXY(String str) {
        if (str.length() == 0) return str;
        return str.charAt(0) == 'x' ? "y" + changeXY(str.substring(1)) : str.charAt(0) + changeXY(str.substring(1));
    }
}
