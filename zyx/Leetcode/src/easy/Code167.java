package easy;

/**
 * Code167：给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 * @author tony
 */
public class Code167 {


    /**
     * 方法一：双指针解题
     * 定义low指向数组的首位，定义high指向数组的末尾
     * 每次计算两数和与目标值的大小，若大于，则右侧指针减少1，若小于，则左侧指针增加1
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        //定义双指针
        int low = 0 , high = numbers.length - 1;
        //循环条件，low小于high
        while (low < high){
            //求和
            int sum = numbers[low] + numbers[high];
            //相等，则表示找到
            if (sum == target) {
                //+1是题目中的例子要求
                return new int[]{low+1, high+1};
                //小于的时候，右侧减1
            }else if(sum > target){
                --high;
                //大于的时候，左侧加1
            }else {
                ++low;
            }
        }
        return new int[]{-1,-1};
    }


    /**
     * 方法二：双指针+二分查找
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        int low = 0 , high = numbers.length - 1;
        while (low < high){
            int mid = low + (high - low) / 2;
            if(numbers[low] + numbers[high] > target){
                --high;
            }else if (numbers[low] + numbers[high] < target) {
                ++low;
            }else if (numbers[low] + numbers[mid] > target) {
                high = mid - 1;
            }else if (numbers[mid] + numbers[high] < target) {
                low = mid + 1;
            }else {
                return new int[]{low+1, high+1};
            }
        }
        return new int[]{-1,-1};
    }

}
