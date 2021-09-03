/**
 * 本题介绍：
 * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
示例：
输入：numbers = [2,7,11,15], target = 9
输出：[1,2]
解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * @author dyp
 * javascript
 **/


/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(numbers, target) {
    var len = numbers.length;
    for(var i=0;i<len-1;i++){
        /**
      * 解题思路 
      * 不完美，使用了双层for循环，时间复杂度太大
      */
        temp = numbers[i];
        for(var j = i+1;j<len;j++)
        {
            if(temp + numbers[j] == target)
                return [i+1,j+1]
        }
    }

};

/**
* 比较优秀的解题思路 
* 方法二：双指针
1. 定义left、right
2. 遍历过程若nums[left] + nums[right] > target，太大了，要小一点，则right左移一位
3. 遍历过程若nums[left] + nums[right] < target，太小了，要大一点，则left右移一位
4. 其余的情况就是nums[left] + nums[right] == target，return [left + 1, right + 1]即可
5. 注意题目的index从1开始，所以return时+1即可
*/
/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(numbers, target) {
    let [letf,right] = [0,numbers.length-1]
    while(letf<right){
        if(numbers[letf] + numbers[right] > target){
            right --;
        }else if(numbers[letf] + numbers[right] < target){
            letf++;
        }else{
            return [letf + 1,right + 1];
        }
    }

};
