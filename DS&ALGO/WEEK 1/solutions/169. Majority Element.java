class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
int half=0;
int count=0;
int n =nums.length;
if(n%2 == 0)
{
half= (n/2);
}
else
{
half=(n/2)+1;
}
​
    for(int i=0;i<nums.length;i++)
    {
        if(map.containsKey(nums[i]))
        {
        map.put(nums[i],map.get(nums[i])+1);
        }
        else
        {
            map.put(nums[i],1);
        }
        if(map.get(nums[i])>= half)
        {
            count= nums[i];
            break;
        }
        
    }
  return count; 
        
    }
}
