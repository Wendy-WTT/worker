package easy;

/**
 * 35: 搜索插入位置
 * 
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author tony
 *
 */
public class Code35 {
	public int searchInsert(int[] nums, int target) {
		// 求出数组的长度
		int n = nums.length;
		// 本题从下标0开始，因此最小值为0，最大值为n-1，因为要插入一个数，要记录插入的位置，因此需要一个额外变量来保存这个下标
		int left = 0, right = n - 1, ans = n;
		// 因为从0开始，因此要些<=号
		while (left <= right) {
			// 求中数，防止溢出
			int mid = ((right - left) / 2) + left;
			// <=这个条件，也可以将>=写在一起，但是=与大小于合并在哪里，就要将ans写在哪里，用来记录mid值
			if (target <= nums[mid]) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}
}
