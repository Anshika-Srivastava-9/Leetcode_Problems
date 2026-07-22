class Solution {
    public int findGCD(int[] nums) {
      int min=nums[0];
      int max=nums[0];
      for(int i=0;i<nums.length;i++){
          min=Math.min(min,nums[i]);
          max=Math.max(max,nums[i]);
      } 
      return gcd(min,max);
    }
    public static int gcd(int a,int b){
        if(a==0) {
            return b;
        }
        return gcd(b%a, a);
    }
}