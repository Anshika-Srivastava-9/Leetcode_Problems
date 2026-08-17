import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // Make a copy and sort it
        int[] temp = score.clone();
        Arrays.sort(temp);

        // score -> rank
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        // Give rank from highest score
        for (int i = n - 1; i >= 0; i--) {
            map.put(temp[i], rank);
            rank++;
        }

        String[] ans = new String[n];

        // Convert rank into medal/name
        for (int i = 0; i < n; i++) {

            int r = map.get(score[i]);

            if (r == 1) {
                ans[i] = "Gold Medal";
            }
            else if (r == 2) {
                ans[i] = "Silver Medal";
            }
            else if (r == 3) {
                ans[i] = "Bronze Medal";
            }
            else {
                ans[i] = String.valueOf(r);
            }
        }

        return ans;
    }
}