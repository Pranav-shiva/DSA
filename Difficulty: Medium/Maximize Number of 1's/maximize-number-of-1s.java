class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int c=0,j=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            c++;
            while(c>k&&j<arr.length){
                if(arr[j]==0)
                c--;
                j++;

            }
           max= Math.max(max,(i-j+1));
        }
        return max;
    }
}