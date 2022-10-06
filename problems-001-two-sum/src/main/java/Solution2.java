class Solution2 extends Solution {

    // SKIP PREVIOUS
    // 10/06/2022 14:56	Accepted	270 ms	45.4 MB	java

    public int[] twoSum(int[] nums, int target) {
        var res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int y = 0; y < nums.length; y++) {
                if (y <= i) {
                    continue;
                }
                var sum = nums[i] + nums[y];
                if (sum != target) {
                    continue;
                }
                res[0] = i;
                res[1] = y;
            }
        }
        System.out.println(
                "Explanation: Because nums[" + res[0] + "] + nums[" + res[1] + "] == "
                + target + ", we return [" + res[0] + ", " + res[1] + "].");
        return res;
    }
}