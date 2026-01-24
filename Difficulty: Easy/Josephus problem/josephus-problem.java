class Solution {
    public int josephus(int n, int k) {
        // code here
        int pos=0;
        for(int i=1;i<n+1;i++){
            pos=(pos+k)%i;
        }
        return pos+1;
    }
}