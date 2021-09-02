/**
 * 本题介绍：给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
 * @author dyp
 * javascript
 **/




/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
 var rotate = function(nums, k) {
     /**
      * 解题思路 对于数组nums,向右移动k位移，等价于将原数组第nums.length-k位置到末尾移动到前面
      */
    k = k%nums.length
    nums.unshift(...nums.splice(nums.length-k))
};