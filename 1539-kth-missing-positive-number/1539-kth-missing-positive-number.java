class Solution {
    public int findKthPositive(int[] arr, int k) {
      int n=arr.length;
      int l=0; int hi=n-1;
      while(l<=hi){
        int mid=(l+hi)/2;
        int correctNo=mid+1;
        int missing=arr[mid]-correctNo;
        if(missing>=k) hi=mid-1;
        else l=mid+1;

      }  
      return hi+1+k;
    }
}