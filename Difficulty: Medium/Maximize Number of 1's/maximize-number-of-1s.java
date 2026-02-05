class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n=arr.length,c=0,j=0,max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            c++;
            while(c>k&&j<n){
                if(arr[j]==0)
                c--;
                j++;
            }
          max=  Math.max(max,i-j+1);
            
        }
        return max;
    }
}