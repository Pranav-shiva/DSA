class Solution {
    public void sortColors(int[] nums) {
        int one=0,two=0,zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }
            if(nums[i]==2){
                two++;
            }
        }
        
        
        int k=0;
        for(int i=0;i<zero;i++){
        nums[k]=0;
        k++;
        }
        for(int i=0;i<one;i++){
        nums[k]=1;
        k++;
        }
        for(int i=0;i<two;i++){
        nums[k]=2;
        k++;
        }
        
    }
}