#include <iostream>
#include <vector>
using namespace std;

// // Brute force approach O(n^2)
vector<int> pairSum(vector<int> nums, int target)
{
    vector<int> ans;
    int n = nums.size();
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (nums[i] + nums[j] == target)
            {
                ans.push_back(i);
                ans.push_back(j);
            }
        }
    }
    return ans;
}

// Optimised Approach O(n) :: not reliable code :: not passing all test case
vector<int> twoPointerPairSum(vector<int> nums, int target)
{
    vector<int> ans;
    int n = nums.size();
    int i = 0, j = n - 1, pairSum;
    while (i < j)
    {
        pairSum = nums[i] + nums[j];
        if (pairSum < target)
        {
            i++;
        }
        else if (pairSum > target)
        {
            j--;
        }
        else
        {
            ans.push_back(i);
            ans.push_back(j);
            return ans;
        }
    }
}

int main()
{
    vector<int> nums = {3, 2, 4};
    int target = 6;
    vector<int> ansr = pairSum(nums, target);
    for (int val : ansr)
    {
        cout << val << "  ";
    }
    return 0;
}