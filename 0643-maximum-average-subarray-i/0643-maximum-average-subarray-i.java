class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
    int sum=0;
    int n=nums.length;
    
    for(int i=0;i<k;i++){
        sum+=nums[i];
       
    }
      int max=sum;
     

         int l=0;
         int r=k;

        while(r<n){
            sum=sum-nums[l]+nums[r];
          max=Math.max(max,sum);
            l++;
            r++;
        }

        
    return (double)max/k;
      }
}