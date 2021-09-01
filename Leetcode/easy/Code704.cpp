#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        std:cout << nums.size();
        int start = 0;
        int end = nums.size()-1;
        int mid = (start + end) / 2;
        while(start <=end){
            if (target<nums[start] || target>nums[end]) {
                return -1;
            }
            if (target == nums[start]) {
                return start;
            }
            if (target == nums[end]) {
                return end;
            }
            if (target == nums[mid]) {
                return mid;
            }
           
            if (target > nums[mid]  ) {
                start = mid+1;
            }
            if (target < nums[mid] )
            {
                end = mid-1;
            }
            mid = (start + end) / 2;
        }
        return -1;

    }
};
int main() {
    Solution s1;
    vector<int> t = { -1,0,3,5,9,12 };
    int s2=s1.search(t, 3);
    std:cout << s2;
}