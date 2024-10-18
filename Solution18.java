import java.util.*;

/*
 * @Description:
 * 
 * 除自身以外数组的乘积
 * 给你一个整数数组 nums，返回数组 answer，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 * 题目数据保证数组 nums 之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内。
 * 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 
 * 示例 1:
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 *  示例 2:
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 */
import java.util.*;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] answer = new int[length];
        int leftProduct = 1;

        // 计算左侧乘积并存储在 answer 中
        for (int i = 0; i < length; i++) {
            answer[i] = leftProduct; // 当前索引的左侧乘积
            leftProduct *= nums[i];   // 更新左侧乘积
        }

        int rightProduct = 1;
        // 计算右侧乘积并与 answer 相乘
        for (int i = length - 1; i >= 0; i--) {
            answer[i] *= rightProduct; // 更新最终结果
            rightProduct *= nums[i];    // 更新右侧乘积
        }

        return answer;
    }
}
