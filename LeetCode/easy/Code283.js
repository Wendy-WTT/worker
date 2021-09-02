/**
 * 本题介绍：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
 * @author dyp
 * javascript
 **/


/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
 var moveZeroes = function(nums) {
    var length = nums.length;

      /**
      * 解题思路 发现一个0 则删除一个 再末尾重新新建一个0代替
      */

        //遍历nums
        for(var i = 0; i < length; i++){
            //如果第i个元素为0
            if(nums[i] === 0){
                //则将这个元素删除
                nums.splice(i , 1);
                //然后在nums后面加个0
                nums.push(0);
                //length--，因为最后这个0不用遍历
                length--;
                //i--，因为i这个位置的0被删除了，i+1位置的元素会成为新的i位置的元素，要判断这个新元素是否为0
                i--;
            }
        }
        return nums;
    
    };