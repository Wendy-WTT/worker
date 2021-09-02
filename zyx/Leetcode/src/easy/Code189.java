package easy;

import java.util.Arrays;

/**
 * 189:给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @author tony
 */
public class Code189 {

    /**
     * 方法一：
     * 创建新的数组进行反转数组
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newNums = new int[n];
        for (int i = 0; i < n; i++) {
            //移位操作的核心就是[(当前位置+要移动的数目) % 整个长度]
            newNums[(i + k) % n] = nums[i];
        }
        //源数据、源数据起始位置、目标数据、目标数据起始位置、复制长度
        System.arraycopy(newNums,0,nums,0,n);
    }


    /**
     * 方法二：
     *  真的妙。
     *  先反转整个数组，
     *  再反转数组中的前k个数
     *  最后反转数组中剩余的数
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate2(nums,3);
        Arrays.stream(nums).forEach(System.out::println);
    }

}
