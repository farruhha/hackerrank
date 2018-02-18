package algorithms.bitmanipulation;

public class MaximumXor {
    static int maximizingXor(int l, int r) {
        // Complete this function
        int max = 0;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                int val = i^j;
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }
}
