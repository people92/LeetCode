class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String[] jewel = jewels.split("");
        
        int cnt = 0 ;
        for(int i = 0 ; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            if(Arrays.asList(jewel).contains(String.valueOf(stone)))
                cnt++;
        }
        
        return cnt;
    }
}