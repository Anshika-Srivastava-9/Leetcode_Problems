class Solution {
    public int smallestNumber(int n, int t) {
       
    for (int i=n;i<=100;i++){
         int product=1;
         int temp=i;
        while(temp>0){
       int ld=temp%10;
        product*=ld;
        temp/=10;
        }
        
        if(product%t==0) 
        return i;
    }
    return -1;
}
}