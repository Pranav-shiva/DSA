class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean found=false;
        int n=nums.length,start=-1,end=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target&&found==false){
                start=i;
                end=i;
                found=true;
                continue;

            }
            if(nums[i]==target){
                 end=i;

            }
        }
        int ans[]=new int[2];
        ans[0]=start;
        ans[1]=end;
        return ans;
        
    }
}