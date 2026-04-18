class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,cm=0;
        for(int i=0;i<nums.length;i++){
        
        cm=cm+nums[i];
        max=Math.max(cm,max);
        if(cm<0)
        cm=0;
        }
        return max;
        
        
    }
}