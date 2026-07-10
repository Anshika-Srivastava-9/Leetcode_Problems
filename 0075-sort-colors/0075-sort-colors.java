class Solution {
    public void sortColors(int[] num) {
        int n=num.length;
     int zero=0;
     int one=0;
     int two=0;
     for(int i=0;i<n;i++){
        if(num[i]==0)
        zero ++;
        else if(num[i]==1) one++;
        else two++;
     }
    int i=0;
     while(zero>0){
        num[i] = 0;
        i++;
        zero--;
     }   
     while(one>0){
        num[i] = 1;
        i++;
        one--;
     }   
     while(two>0){
        num[i] = 2;
        i++;
        two--;
     }   
      }
}