package ap_1;

public class UserCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) == 0) {
            return Integer.compare(aId, bId);
        } else if (aName.compareTo(bName) > 0) return 1;
        else return -1;
    }
}
