class Solution {
    public double myPow(double x, int n) {
        long N = n;   // convert once

        if(N < 0){
            return 1 / power(x, -N);
        }
        return power(x, N);
    }

    public double power(double x, long n){
        if(n == 0) return 1;

        double half = power(x, n/2);
        double halfPowerSq = half * half;

        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
}