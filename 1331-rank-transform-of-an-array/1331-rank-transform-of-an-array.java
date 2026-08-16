import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        
        int[] temp = arr.clone();
        Arrays.sort(temp);

        
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        
        for (int ele : temp) {
            if (!map.containsKey(ele)) {
                map.put(ele, rank);
                rank++;
            }
        }

        // Create answer
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}