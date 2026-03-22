// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        return ((n&0x0f)<<4|(n&0xf0)>>4);
    }
}