class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int sum=0;
        int left_sum=0;
        int right_sum=0;
        for(int i=0;i<n;i++){
              sum+=nums[i];
        }
        int cum_sum=0;
        for(int i=0;i<n;i++){
            left_sum=cum_sum;
            right_sum= sum-cum_sum-nums[i];
             if(left_sum==right_sum)
             return i;
             cum_sum+=nums[i];
        }
        

        return -1;
    }
}