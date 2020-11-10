class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0 , high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = low + 1;
            }
        }
        return (low);
    }
}
