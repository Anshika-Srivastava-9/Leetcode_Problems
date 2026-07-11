class Solution {
    public int mySqrt(int n) {
        long i=0; long j=n;
        while(i<=j){
            long mid=(i+j)/2;
            if(mid*mid ==n) return (int)mid;
            
            else if(mid*mid <n)  i=mid+1;
            
            else j=mid-1;
        }
        return (int)j;
    }
}