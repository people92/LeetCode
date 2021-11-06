class Solution {
    public String sortSentence(String s) {
     
        String[] splitedStr = s.split(" ");
        
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String str1, String str2) {
                int a = Integer.parseInt(str1.substring(str1.length()-1));
                int b = Integer.parseInt(str2.substring(str2.length()-1));
                
                if( a > b) return 1;
                else if( a == b) return 0;
                else return -1;
            }
        };
        Arrays.sort(splitedStr, comparator);
        
        String output = "";
        for(int i = 0 ; i < splitedStr.length; i++) {
            output += splitedStr[i];
            if(i!=splitedStr.length -1) output += " ";
        }
        
        return output.replaceAll("[0-9]","");
    }
}