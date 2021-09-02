/*
题目：给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/binary-search
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
var search = function(nums, target) {
    //1. 找到始末两区间
    let left = 0, right =  nums.length-1
    //2. 循环遍历的终止条件，当两指针指向同一位置时代表遍历结束
    while(left <= right) {
        //3. 位运算找到中间值
        let mid = (left + right) >> 1
        //4. 判断中间值与目标值大小，相等即返回
        if(nums[mid] === target) {
            return mid
        //5. 判断中间值和目标值大小从而缩小区间，中<目，左区间变为中后面一个
        }else if (nums[mid] < target) {
            left = mid + 1
        //6. 中>目，右区间变为中前面一个
        }else {
            right = mid - 1
        }
    }   
    return -1
};