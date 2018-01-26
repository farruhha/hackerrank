package contest;

public class test {
    public static void main(String[] args) {
        long sum = (long) Math.pow(10, 9) + 7;
        System.out.println(f(2,5));
    }

    static int f(int k, int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 1) {
            sum += i;
            i *= k;
        }

        return sum;
    }
}
