class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max=0,curr=0;
        for(int i=0;i<k;i++){
            max=max+arr[i];
        }
        curr=max;
        for(int i=k;i<arr.length;i++){
             curr=curr+arr[i]-arr[i-k];
            
            max=Math.max(curr,max);
        }
        return max;
    }
}