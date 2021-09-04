/*
题目：给你一个按"非递减顺序"排序的整数数组nums，返回每个数字的平方组成的新数组，要求也按"非递减顺序"排序。
*/
/*
解题思路：使用map函数对数组进行操作，item代表对每个元素都要操作；
         使用sort函数对数组进行排序，参数(a,b)=>a-b代表，a>b时，a在后面，a<b时，b在后面
*/
var sortedSquares = function(nums) {
    return nums.map(item => item * item).sort((a,b) => a - b)
 };