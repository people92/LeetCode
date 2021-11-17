class Solution {
    public int[] shuffle(int[] nums, int n) {
        int period = nums.length % n;
        int[] result = new int[nums.length];
   
        int cnt = 0;
        for(int i = 0 ; i < n ; i++) {
            result[cnt] = nums[i];
            result[cnt+1] = nums[i+n];
            cnt = cnt + 2;
        }
        return result;
    }
}