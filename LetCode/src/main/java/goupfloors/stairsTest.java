package goupfloors;

public class stairsTest {
    public static void main(String[] args) {
        System.out.println(tmpMethod(40));
    }

    // NOTE_BY_ZWC: f(n) = f(n-1) + f(n-2);
    public static int tmpMethod(int n) {
        int totalCount = 0;
        return retureCount(totalCount, n);
    }

    public static int retureCount(int totalCount, int left) {
        if (left > 2) {
            return totalCount + retureCount(totalCount, left - 1) + retureCount(totalCount, left - 2);
        } else if (left == 2) {
            return totalCount + 2;
        } else if (left == 1) {
            return totalCount;
        } else {
            throw new RuntimeException();
        }
    }
}
