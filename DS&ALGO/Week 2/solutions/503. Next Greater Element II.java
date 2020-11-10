class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i%nums.length]){
                stack.pop();
              }
            if(stack.empty()){
                res[i%nums.length] = -1;
            }
            else{
                res[i%nums.length] =  nums[stack.peek()];
            }
            stack.push(i % nums.length);
        }
        return res;
    }
}
