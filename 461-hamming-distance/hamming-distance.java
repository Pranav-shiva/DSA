class Solution {
    public int hammingDistance(int z, int y) {
        int x=z^y;
        int c=0;
        while(x!=0){
            x=x&(x-1);
            c++;
        }
    return c;

        
    }
}