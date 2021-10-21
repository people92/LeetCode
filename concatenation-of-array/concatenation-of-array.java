class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] copyNums = nums.clone();
        
        return IntStream.concat(Arrays.stream(nums), Arrays.stream(copyNums)).toArray();
    }
}