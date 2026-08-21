import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        
        Arrays.sort(arr, (a, b) -> {

           
            if (!map.get(a).equals(map.get(b))) {
                return map.get(a) - map.get(b);
            }

            
            return b - a;
        });

        
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }
}