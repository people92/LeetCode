class Solution {
    public String restoreString(String s, int[] indices) {
        
        String[] str = new String[s.length()];

        for(int i = 0 ; i < indices.length; i++) {
            int index = indices[i];
            str[index] = String.valueOf(s.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        for(String st : str) {
            sb.append(st);
        }
        return sb.toString();
    }
}