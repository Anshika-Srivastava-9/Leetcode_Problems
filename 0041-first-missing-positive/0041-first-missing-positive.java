class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int ele :nums){
            set.add(ele);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i) ){
                set.add(i);
                return i;
            }
            
        }
        return nums.length+1;
    }
}