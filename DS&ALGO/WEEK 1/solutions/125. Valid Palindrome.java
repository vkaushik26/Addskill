class Solution {
    public boolean isPalindrome(String s) {
        
        if(s==""){
            return true;
        }
        String s1=s.replaceAll("\\W", "").toLowerCase();
        
       // System.out.print(s1);
        int i=0, j=s1.length() -1;
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j))
                return false;
            i++;
            j--;
            
        }
        
        return true;
        
    }
}
