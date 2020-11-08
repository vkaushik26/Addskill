class Solution {
    public void sortColors(int[] nums) {
        
        int low=0,mid=0,high=nums.length-1;
        int temp;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                if(low!=mid)
                {
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    
                }
                low++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else
            {
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }    
    }
    
​
}
