class Solution {
    public boolean containsDuplicate(int[] nums) {
        int cnt = (int) Arrays.stream(nums).distinct().count();
        
        return nums.length == cnt ? false : true;
    }
}