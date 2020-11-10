class Solution {
    public int mySqrt(int x) {
      if(x == 0 || x == 1 ){
            return x;
        }
        long low = 1, high = x , res =-1;
        
        while(low <= high){
            long mid = (low + high)/2;
            long sqrt = mid*mid;
            if(sqrt == x){
                return (int) mid;
            }
            else if(sqrt > x){
                high = mid -1;
            }
            else{
                low = mid + 1;
                res = mid;
            }       
        }
        return (int) res;
    }
}
