//Justin Butler 10/23/2021
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
