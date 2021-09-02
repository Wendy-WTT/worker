package easy;

import java.util.Arrays;

/**
 * 977: 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * @author tony
 */
public class Code977 {


    public static int[] sortedSquares(int[] nums) {
        //事实证明，sorted所谓的自然排序就是升序排序
        return Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }

    public static int[] sortedSquares2(int[] nums) {
         if (nums == null || nums.length < 1) {
             return null;
         }
         int[] ans = new int[nums.length];
         for (int i = 0; i < nums.length; ++i) {
             ans[i] = nums[i] * nums[i];
         }
         Arrays.sort(ans);
         return ans;
    }



    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Arrays.stream(sortedSquares(nums)).forEach(System.out::println);
    }

}
