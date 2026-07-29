class Solution {

    private static final long LIMIT = 1_000_001L;

    public String smallestPalindrome(String s, int k) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int[] half = new int[26];
        StringBuilder middle = new StringBuilder();

        int halfLength = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLength += half[i];

            if ((freq[i] & 1) == 1) {
                middle.append((char) ('a' + i));
            }
        }

        if (countWays(half) < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLength; pos++) {

            for (int ch = 0; ch < 26; ch++) {

                if (half[ch] == 0) {
                    continue;
                }

                half[ch]--;

                long ways = countWays(half);

                if (ways >= k) {
                    left.append((char) ('a' + ch));
                    break;
                } else {
                    k -= ways;
                    half[ch]++;
                }
            }
        }

        String firstHalf = left.toString();
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        return firstHalf + middle + secondHalf;
    }


    private long countWays(int[] half) {

        int total = 0;
        for (int x : half) {
            total += x;
        }

        long answer = 1;
        int remaining = total;

        for (int i = 0; i < 26; i++) {

            int take = half[i];

            if (take == 0) {
                continue;
            }

            long value = combinationLimited(remaining, take);

            if (value >= LIMIT) {
                return LIMIT;
            }

            if (answer > LIMIT / value) {
                return LIMIT;
            }

            answer *= value;

            if (answer >= LIMIT) {
                return LIMIT;
            }

            remaining -= take;
        }

        return answer;
    }


    private long combinationLimited(int n, int r) {

        if (r > n) {
            return 0;
        }

        r = Math.min(r, n - r);

        long result = 1;

        for (int i = 1; i <= r; i++) {

            long numerator = n - r + i;

            if (result > LIMIT) {
                return LIMIT;
            }

            result = result * numerator / i;

            if (result >= LIMIT) {
                return LIMIT;
            }
        }

        return Math.min(result, LIMIT);
    }
}