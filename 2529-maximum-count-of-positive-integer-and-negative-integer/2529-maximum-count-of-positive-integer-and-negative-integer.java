import java.util.*;
class Solution {
    public int maximumCount(int[] arr) {
    int n=arr.length;
    int pos=0;
    int neg=0;
    int max=0;
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            neg++;
        }
        else if(arr[i]>0){
            pos++;
        }
        else{
            continue;
        }
        max= Math.max(neg,pos);
    }    
return max;
    }
}