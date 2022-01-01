class Solution {
    public boolean isHappy(int n) {
        String str = Integer.toString(n);
        boolean isHappyNumber = false;

        while(str.length() != 1 && !isHappyNumber) {
            int temp = 0;
            for(int i = 0 ; i < str.length(); i++) {
                temp += Math.pow(Integer.parseInt(str.substring(i, i+1)), 2);
            }
            if(temp == 1) {
                isHappyNumber = true;
            }
            str = Integer.toString(temp);
        }
        if("1".equals(str) || "7".equals(str)) isHappyNumber = true;
        return isHappyNumber;
    }
}