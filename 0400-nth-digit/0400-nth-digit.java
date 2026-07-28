class Solution {
    public int findNthDigit(int n) {

        long digit = 1;
        long start = 1;
        long count = 9;


        while(n > digit * count){

            n -= digit * count;

            digit++;

            start *= 10;

            count *= 10;
        }


        long num = start + (n-1)/digit;

        String s = String.valueOf(num);

        return s.charAt((int)((n-1)%digit))-'0';
    }
}