import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchRangeTest1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        int[] actual = new Solution().searchRange(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchRangeTest2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        int[] actual = new Solution().searchRange(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchRangeTest3() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        int[] actual = new Solution().searchRange(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }
}
