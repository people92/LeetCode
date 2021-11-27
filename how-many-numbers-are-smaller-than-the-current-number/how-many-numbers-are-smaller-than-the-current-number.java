class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++) {
            int num = nums[i];
            int cnt = (int) Arrays.stream(nums).filter(n -> n < num).count();
            result[i] = cnt;
        }
        return result;
    }
}