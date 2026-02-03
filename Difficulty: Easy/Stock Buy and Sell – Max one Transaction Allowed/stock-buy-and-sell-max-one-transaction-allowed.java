class Solution {
    public int maxProfit(int[] arr) {
        // Code here
        int n=arr.length,i=0,j=i+1,max=0;
        while(j<n){
            if(arr[i]>arr[j]){
                i=j;
                
            }
                max=Math.max(max,arr[j]-arr[i]);
            
            j++;
        }
        return max;
    }
}