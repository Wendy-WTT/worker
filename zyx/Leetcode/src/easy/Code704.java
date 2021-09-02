package easy;

/**
 * 704：二分查找 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的
 * target，如果目标值存在返回下标，否则返回 -1。
 * 
 * 来源：力扣（LeetCode）
 * 
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author tony
 *
 */
public class Code704 {

	public static int search(int[] nums, int target) {
		// 首先获取整个数组的初始位置和末尾位置
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			// 求中数，这个做法是为了防止越界溢出
			int middle = low + (high - low) / 2;
			// 求数组中的中数值
			int middleValue = nums[middle];
			// 如果小于目标值，则在后面找
			if (middleValue < target) {
				low = middle + 1;
				// 如果大于目标值，则在前面找
			} else if (middleValue > target) {
				high = middle - 1;
				// 相等，就直接返回中位数
			} else {
				return middle;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		int i = search(nums, target);
		System.out.println(i);
	}
}
