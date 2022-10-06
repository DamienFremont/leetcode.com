class Solution3 extends Solution {

    // SKIP PREVIOUS, NO VARS
    // 10/06/2022 15:02	Accepted	89 ms	42.4 MB	java

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if ( (nums[i] + nums[y]) == target) {
                    return new int[]{i, y};
                }
            }
        }
        throw new RuntimeException();
    }
}