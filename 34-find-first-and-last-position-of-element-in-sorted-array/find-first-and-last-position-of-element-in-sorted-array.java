class Solution {

    int binarySearch(int nums[], int t) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == t) {
                return mid;
            } else if (t < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int t) {
        int[] ans = new int[2];
        if (nums == null || nums.length == 0) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        int s = binarySearch(nums, t);
        if (s == -1) {             
            return new int[]{-1, -1};
        }

        int i = s, j = s;
        
        while (i + 1 < nums.length && nums[i + 1] == t) {
            i++;
        }
       
        while (j - 1 >= 0 && nums[j - 1] == t) {
            j--;
        }

        ans[0] = j; 
        ans[1] = i; 
        return ans;
    }
}
