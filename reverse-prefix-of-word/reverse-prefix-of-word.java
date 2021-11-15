class Solution {
    public String reversePrefix(String word, char ch) {
        
        String result = "";
        int index = -1;
        for(int i = 0 ; i < word.length(); i++) {
            char w = word.charAt(i);
            
            if(ch == w) {
                index = i;
                break;
            }
        }
        
        if(index == -1) return word;
        for(int i = index; i >= 0 ; i--) {
            result += String.valueOf(word.charAt(i));
        }
        for(int i = index +1; i < word.length(); i++) {
            result += String.valueOf(word.charAt(i));
        }
        return result;
    }
}