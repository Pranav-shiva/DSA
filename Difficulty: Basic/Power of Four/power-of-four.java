class Solution {
    int isPowerOfFour(long n) {
        // Your code here
        if(n%3==1&&(n&(n-1))==0)
        return 1;
        return 0;
    }
}