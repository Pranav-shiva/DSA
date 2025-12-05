class Solution {
    public int countPartitions(int[] nums) {
        int sum=0,lsum=0,c=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
          for(int i=0;i<nums.length-1;i++){
            lsum=lsum+nums[i];
           int rsum=sum-lsum;
            if((lsum%2)==(rsum%2))
            c++;
        }
        return c;
        
    }
}