class Solution {
    public boolean isTrionic(int[] arr) {
        int n=arr.length,c=0,i=0;
        while(i<n-1&&arr[i]<arr[i+1]){
            i++;
            
        }
                    if(c==i){
                        return false;

                    }
                    int c1=i;

         while(i<n-1&&arr[i]>arr[i+1]){
            i++;
           
        }
        if(c1==i)
                return false;
int c3=i;
         while(i<n-1&&arr[i]<arr[i+1]){
            i++;
            
        }
        if(c3==i)
        return false;
        
return i == n - 1;

        
    }
}