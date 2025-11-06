class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int arr[]=new int [num1.length+num2.length];
        int n =num1.length+num2.length;
        int i=0,j=0;
        int k=0;
        while(i<num1.length&&j<num2.length){
            if(num1[i]<num2[j]){
                arr[k++]=num1[i++];
            }
            else{
                arr[k++]=num2[j++];
            }
            
        }
        while(i<num1.length){
            arr[k++]=num1[i++];
        }
        while(j<num2.length){
            arr[k++]=num2[j++];
        }

        if((num1.length+num2.length)%2==0){
          
            double ans=(arr[n/2]+arr[(n/2)-1])/2.0;
            return ans;

        }


        return arr[n/2];

        
    }
}