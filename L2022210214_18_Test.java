import org.example.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L2022210214_18_Test {

    /*
     * 测试目的：验证正常输入的输出
     * 用到的测试用例：nums = [1, 2, 3, 4]
     */
    @Test
    public void testNormalCase() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /*
     * 测试目的：验证包含零的情况
     * 用到的测试用例：nums = [-1, 1, 0, -3, 3]
     */
    @Test
    public void testWithZero() {
        Solution solution = new Solution();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /*
     * 测试目的：验证处理只有零的情况
     * 用到的测试用例：nums = [0, 0, 0]
     */
    @Test
    public void testAllZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /*
     * 测试目的：验证负数的情况
     * 用到的测试用例：nums = [-1, -2, -3, -4]
     */
    @Test
    public void testNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-1, -2, -3, -4};
        int[] expected = {-24, -12, -8, -6}; // 负数情况的正确预期结果
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /*
     * 测试目的：验证单个元素的情况
     * 用到的测试用例：nums = [5]
     */
    @Test
    public void testSingleElement() {
        Solution solution = new Solution();
        int[] nums = {5};
        int[] expected = {1}; // 只有一个元素，返回1
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /*
     * 测试目的：验证多个相同元素的情况
     * 用到的测试用例：nums = [2, 2, 2, 2]
     */
    @Test
    public void testSameElements() {
        Solution solution = new Solution();
        int[] nums = {2, 2, 2, 2};
        int[] expected = {8, 8, 8, 8}; // 2^3 = 8
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }
}