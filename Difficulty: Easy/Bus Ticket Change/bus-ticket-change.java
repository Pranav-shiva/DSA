class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int f=0,ten=0,t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5)
            f++;
           else if(arr[i]==10&&f>=1){
               f--;
               ten++;
           }
           else if(arr[i]==20){
               if(ten>=1&&f>=1){
                   f--;
                   ten--;
               }
               else if(f>=3){
                   f=f-3;
               }
               else {
                   return false;
               }
           }
           else
           return false;
        }
        return true;
    }
}