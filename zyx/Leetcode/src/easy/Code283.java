package easy;

import java.util.Arrays;

/**
 * code283:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @author tony
 */
public class Code283 {
    /**
     *  本体使用的是双指针的思想
     * 使用双指针，左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
     * 右指针不断向右移动，每次右指针指向非零数，则将左右指针对应的数交换，同时左指针右移
     * [0    ,1    ,0    ,3    ,12]
     *  ↑left
     *  ↑right
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;

        while (right < n){
            if(nums[right] != 0){
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Code283().moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

}
