class Solution {
    public int longestOnes(int[] nums, int k) {
     int max=0;
     int l=0; int zero=0;
    for(int r=0;r<nums.length;r++){
        if(nums[r]==0)
            zero++;

            while(zero>k){
                if(nums[l]==0){ 
                zero--;
                
                } 
                 l++;
            }

            int length=r-l+1;
            max=Math.max(max,length);
           
        }
       
     return max;
    }
}