import java.util.*;

class Solution {

    public void helper(List<Integer> ans,int[] nums,int idx,List<List<Integer>> result) {

        if (idx == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        // pick
        ans.add(nums[idx]);
        helper(ans, nums, idx + 1, result);

        // backtrack
        ans.remove(ans.size() - 1);

        // don't pick
        helper(ans, nums, idx + 1, result);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        helper(new ArrayList<>(), nums, 0, result);

        return result;
    }
}