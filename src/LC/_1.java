package LC;

public class _1{
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 遍历第一个数
        for (int i = 0; i < nums.length; i++) {
            // 遍历第二个数（从 i+1 开始，避免重复使用）
            for (int j = i + 1; j < nums.length; j++) {
                // 如果两数之和等于目标值
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // 返回下标
                }
            }
        }
        // 题目保证有解，这里随便返回
        return new int[0];
    }
}
}