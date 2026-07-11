class Solution {

    int Sqrt(long n) {
        long i = 1, j = n;

        while (i <= j) {
            long mid = i + (j - i) / 2;

            if (mid == n / mid && mid * mid == n)
                return (int) mid;

            if (mid <= n / mid)
                i = mid + 1;
            else
                j = mid - 1;
        }

        return (int) j;
    }

    public int arrangeCoins(int n) {
        return (Sqrt(8L * n + 1) - 1) / 2;
    }
}