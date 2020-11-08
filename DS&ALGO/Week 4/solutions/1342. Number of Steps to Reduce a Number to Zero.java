class Solution {
    public int numberOfSteps (int num) {
       int temp= num;
        int sum=0;
        while(temp!=0){
            if(temp%2 == 0)
            {
                temp=temp/2;
                sum++;
            }
            else{
                temp=temp-1;
                sum++;
            }
        }
        return sum; 
    }
}
