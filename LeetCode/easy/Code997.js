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
 * 数组其实是有序的， 只不过负数平方之后可能成为最大数了。

那么数组平方的最大值就在数组的两端，不是最左边就是最右边，不可能是中间。

此时可以考虑双指针法了，i指向起始位置，j指向终止位置。

定义一个新数组result，和A数组一样的大小，让k指向result数组终止位置。

如果A[i] * A[i] < A[j] * A[j] 那么result[k--] = A[j] * A[j]; 。

如果A[i] * A[i] >= A[j] * A[j] 那么result[k--] = A[i] * A[i]; 。

 */
/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var sortedSquares = function(nums) {
    let res = []
    for(let i =0 ,j = nums.length-1 ;i<=j;){
        const left = Math.abs(nums[i]);
        const right = Math.abs(nums[j])

        if(right > left){
            res.unshift(right * right)
            j--;
        } else{
            res.unshift(left * left)
            i++;
        }
    }
    return res;

};

