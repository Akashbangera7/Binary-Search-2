// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            //first element is lowest
            if(nums[low] < nums[high]) return nums[low];
            int mid = low + (high - low) / 2;
            //if mid is less than both its neighbors, do binary search
            if((mid == nums.length - 1 || nums[mid] < nums[mid+1]) && (mid == 0 || nums[mid] < nums[mid-1])) {
                return nums[mid];
            } else {
                if(nums[low]<=nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}