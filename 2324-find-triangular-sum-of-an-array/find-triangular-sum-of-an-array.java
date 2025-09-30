class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int k=0;
            for(int j=0;j<i;j++){
                nums[j]=(nums[k]+nums[k+1])%10;
                k++;
            }
        }
        return nums[0];
    }
}