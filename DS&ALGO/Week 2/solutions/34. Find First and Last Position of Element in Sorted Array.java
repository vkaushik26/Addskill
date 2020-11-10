class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] range = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                range[0] = i;
                break;
            }
        }
        if (range[0] == -1) {
            return range;
        }
        for (int j = nums.length-1; j >= 0; j--) {
            if (nums[j] == target) {
                range[1] = j;
                break;
            }
        }
​
        return range;
​
    }
}
