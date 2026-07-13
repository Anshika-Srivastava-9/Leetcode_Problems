class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    int count=0;int product=1;
    int left=0;
    for(int r=0;r<nums.length;r++){
        product*= nums[r];

        while(product>=k){
            product/=nums[left];
            left++;
        }
        count +=(r-left+1);
    }    
    return count;
    }
}