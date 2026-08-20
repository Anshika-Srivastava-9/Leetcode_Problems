class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int i = 0;
        int j = 0;

        arr1[i++] = nums[0];
        arr2[j++] = nums[1];

        for (int k = 2; k < n; k++) {

            
            if (arr2[j - 1] > arr1[i - 1]) {
                arr2[j++] = nums[k];
            } else {
                arr1[i++] = nums[k];
            }
        }

        
        int[] ans = new int[n];

        
        for (int k = 0; k < i; k++) {
            ans[k] = arr1[k];
        }

        
        for (int k = 0; k < j; k++) {
            ans[i + k] = arr2[k];
        }

        return ans;
    }
}