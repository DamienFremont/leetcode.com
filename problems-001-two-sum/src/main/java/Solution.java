import java.util.ArrayList;

class Solution {

    // BRUTE FORCE
    // 10/06/2022 14:09	Accepted	287 ms	45.6 MB	java

    public int[] twoSum(int[] nums, int target) {
        var res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int y = 0; y < nums.length; y++) {
                if (i == y) {
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