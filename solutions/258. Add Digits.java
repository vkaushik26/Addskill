class Solution {
    public int addDigits(int num) {
        
        if(num/10!=0){
            return addDigits(num/10+num%10);
        }else{
            return num;
        }        
    }
}