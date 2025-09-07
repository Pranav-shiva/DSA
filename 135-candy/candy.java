class Solution {
    public int candy(int[] rat) {
        int n=rat.length;
        int arr[]=new int[n];
          for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        for(int i=1;i<n;i++){
            if(rat[i-1]<rat[i]){
                arr[i]=arr[i-1]+1;
            }

        }
        for(int i=n-2;i>=0;i--){
            if(rat[i]>rat[i+1]){
                arr[i]=Math.max(arr[i],arr[i+1]+1);
            }
        }
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        return sum;
    }
}