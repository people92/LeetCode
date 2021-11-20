class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        
        int left = 0;
        int right = 0;
        
        for(int i = 0 ; i < len; i++) {
            if(isVowel(s.charAt(i)))
                left++;
        }
       for(int i = len ; i < s.length(); i++) {
            if(isVowel(s.charAt(i)))
                right++;
        }
        
        return left == right ? true : false;
    }
    
    public boolean isVowel(char ch) {
        if(Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I' ||
           Character.toUpperCase(ch) == 'O' || Character.toUpperCase(ch) == 'U')
            return true;
        
        return false;
    }
}