class Solution {
    public char findTheDifference(String s, String t) {
       int a = 0;
        int b = 0;
        for (int i = 0; i < t.length(); i++){
            if (i < s.length()) {
                a = a + s.charAt(i);
            }
            b = b + t.charAt(i);
        }
        return (char)(b-a); 
    }
}
