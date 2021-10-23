//Justin Butler 10/23/2021
/*
0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array II.
Memory Usage: 38.5 MB, less than 93.69% of Java online submissions for Find Minimum in Rotated Sorted Array II.
*/
class Solution {
    public int findMin(int[] nums) {
        int output = Integer.MAX_VALUE;
        for(int current: nums)
        {
            output = Math.min(current, output);
        }
        return output;
    }
}
