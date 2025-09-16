class Solution {
    public int search(int[] nums, int k) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==k){
                return mid;
            }
            if(nums[mid]<k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        return -1;
    }
}