package easy;

/**
 * 278：第一个错误的版本
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * 
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * 
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version
 * 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/first-bad-version
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author tony
 *
 */
public class Code278 {

	/*
	 * The isBadVersion API is defined in the parent class VersionControl. boolean
	 * isBadVersion(int version);
	 */

	public int firstBadVersion(int n) {
		// 因为本题是从下标1开始的，从n结尾的，所以这里设置初始值为1，末尾值为n
		int low = 1;
		int high = n;
		// 这里不能使用low<=high，只能使用<
		while (low < high) {
			int mid = low + (high - low) / 2;
			// 题目中已经定义
			if (isBadVersion(mid)) {
				// 往左走向上取整
				high = mid;
			} else {
				// 往右走向下取整
				low = mid + 1;
			}
		}
		return low;
	}

	/**
	 * 这里只是为了不报错，而编写的一个方法，原系统已经实现了这个方法
	 * 
	 * @param mid
	 * @return
	 */
	private boolean isBadVersion(int mid) {
		return false;
	}

}
