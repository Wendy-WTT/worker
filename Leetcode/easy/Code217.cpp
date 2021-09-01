class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int, int> maps;
        map<int, int>::iterator iter;
        for (int i = 0;i < nums.size();i++) {
            iter = maps.find(nums[i]);
            if (iter != maps.end())
            {
                return true;
            }
            else
            {
                maps[nums[i]] = i;
            }
          
        }
        return false;
    }
};