class Solution {
    public int missingNumber(int[] nums) {
     HashSet<Integer> set =new HashSet<>();

     for(int ele:nums){
       set.add(ele);
     }
     int ans=0;
     int n=nums.length;
     for(int i=0;i<=n;i++){
        if(!set.contains(i))
        ans+=i;
     }
     return ans;
    }
}