class Solution {
    public int findKthLargest(int[] nums, int k) {
       if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int i = nums.length - k; 
        return nums[i]; 
    }
}
