/**
 * 本题介绍：给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * @author dyp
 * javascript
 **/

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    /**
     * 解题思路
    最简单的想法是构造一个新数组，储存所有数的平方
    再对新的数组使用冒泡排序，最后得到正确结果
     */
    var tempArray = new Array();
    for(let i = 0;i<nums.length;i++){
        tempArray[i] = nums[i] * nums[i];
    }  
    let len = tempArray.length;
    let temp;
    for(var i=0;i<len;i++){
        for(var j=0;j<len-i-1;j++){
            if(tempArray[j]>tempArray[j+1]){
                temp = tempArray[j];
                tempArray[j] = tempArray[j+1];
                tempArray[j+1] = temp
            }
        }
    }
    return tempArray;

};

/**
 * 官方解答--双指针
 */

