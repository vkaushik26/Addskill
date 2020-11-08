class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int top = 0;
        int bottom = matrix.length-1;
        
        
        while(top <= bottom) {
            int mid = top + (bottom - top)/2;
            
            int first = matrix[mid][0];
            int last = matrix[mid][matrix[mid].length-1];
            
            if(target >= first && target <= last) return binarySearch(matrix[mid], target);
            if(target < first) bottom = mid-1;
            if(target > last) top = mid+1;
        }
        
        return false;  
    }
    private boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
​
        while(left <= right) {
            int mid = left + (right-left)/2;
            
            if(nums[mid] == target) return true;
            if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        
        return false;
    }
}
