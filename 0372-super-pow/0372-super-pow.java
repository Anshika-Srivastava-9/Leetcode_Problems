class Solution {

    int mod = 1337;

    public int superPow(int a, int[] b) {

        a %= mod;

        int ans = 1;

        for(int digit:b){

            ans = pow(ans,10) * pow(a,digit) % mod;

        }

        return ans;
    }


    int pow(int a,int b){

        int result = 1;

        while(b>0){

            if((b&1)==1)
                result=result*a%mod;

            a=a*a%mod;

            b/=2;
        }

        return result;
    }
}