/*
题目：给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     请必须使用时间复杂度为 O(log n) 的算法。
*/
/*
思路：顺序数组-->二分查找法：始末区间，中间值，缩小区间遍历；
     当没有找到的时候，right指针的后一位就是需要插入的位置；
     当插入的数比数组中最后一个数值还大的时候，那么当前的right就是插入点；
     
*/
var searchInsert = function(nums, target) {
    let left = 0, right = nums.length-1
    while(left <= right) { // 判断循环终止条件，什么时候遍历完
        let mid = Math.floor(left + (right - left) / 2)  // 定义中值，防止溢出
        if (target > nums[mid]) { // 将目标值与中值进行判断，缩小区间
            left = mid + 1
        }else if (target < nums[mid]) {
            right = mid -1
        }else {
            return mid
        }
    }
    return right == nums.length ? right : right + 1
};