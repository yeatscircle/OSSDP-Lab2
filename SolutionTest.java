import org.example.Solution;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    /**
     * 测试全正数数组
     */
    @Test
    public void testAllPositive() {
        Solution solution = new Solution();
        int[] nums = { 2, 3, 4 };
        int[] expected = { 12, 8, 6 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试数组包含负数
     */
    @Test
    public void testNegativeAndZero() {
        Solution solution = new Solution();
        int[] nums = { -1, 0, -3, 2 };
        int[] expected = { 0, 6, 0, 0 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试单元素数组
     */
    @Test
    public void testSingleElementArray() {
        Solution solution = new Solution();
        int[] nums = { 10 };
        int[] expected = { 1 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试全为1的数组
     */
    @Test
    public void testAllOnesArray() {
        Solution solution = new Solution();
        int[] nums = { 1, 1, 1, 1, 1 };
        int[] expected = { 1, 1, 1, 1, 1 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试全负数的数组
     */
    @Test
    public void testAllNegative() {
        Solution solution = new Solution();
        int[] nums = { -1, -2, -3, -4 };
        int[] expected = { -24, -12, -8, -6 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试全为零的数组
     */
    @Test
    public void testAllZeros() {
        Solution solution = new Solution();
        int[] nums = { 0, 0, 0, 0 };
        int[] expected = { 0, 0, 0, 0 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试含有多个零的数组
     */
    @Test
    public void testMixedZeros() {
        Solution solution = new Solution();
        int[] nums = { 1, 0, 2, 0 };
        int[] expected = { 0, 0, 0, 0 };
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试空数组的情况
     */
    @Test
    public void testEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 性能测试：大数组
     */
    @Test
    public void testLargeArray() {
        Solution solution = new Solution();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1; // 1到100000
        }
        long startTime = System.nanoTime();
        solution.productExceptSelf(nums);
        long endTime = System.nanoTime();
        System.out.println("Performance test duration: " + (endTime - startTime) + " ns");
    }
}
