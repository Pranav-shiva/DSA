class Solution {
    public int minJumps(int[] arr) {
        // code here
        int max=0,curr=0,j=0,n=arr.length;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,arr[i]+i);
            if(curr==i){
                curr=Math.max(curr,max);
                j++;
                if(curr>=n-1){
                    return j;
                }
            }
        }
        return -1;
    }
}