class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] charCount = new int[26];
        
            for(int i = 0; i < p.length(); i++) 
                charCount[p.charAt(i) - 'a']++;
        
            List<Integer> retList = new ArrayList<>();
            int left = 0, right = 0, toVisit = p.length();
            while(right < s.length()){
                // If char at right end of window is present in p(charCount)
                if(charCount[s.charAt(right) - 'a'] >= 1) {
                    toVisit--; 
                } 
                charCount[s.charAt(right) - 'a']--; // Reduce count of char at right end.
                right++; // Increment right end.
​
                if(toVisit == 0) retList.add(left); 
                if(right - left == p.length()){
                    if(charCount[s.charAt(left) - 'a'] >= 0){ 
                        toVisit++; 
                    }
                    charCount[s.charAt(left) - 'a']++;
                    left++; // Just to slide the window.
                }
            }
        return retList;  
          
    }
}
