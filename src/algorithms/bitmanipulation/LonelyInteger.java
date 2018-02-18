package algorithms.bitmanipulation;

public class LonelyInteger {
    static int lonelyinteger(int[] a) {
        // Complete this function
        if (a.length == 1) {
            return a[0];
        } else {
            int c = a[0] ^ a[1];
            for (int i = 2; i < a.length; i++) {
                c = c ^ a[i];
            }
            return c;
        }
    }
}
