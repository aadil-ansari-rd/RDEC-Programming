#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Brute force algo O(n^2)
int bruteForce(vector<int> nums)
{
    int count, n = nums.size();
    for (int val : nums)
    {
        count = 0;
        for (int el : nums)
        {
            if (val == el)
            {
                count++;
            }
        }
        if (count > n / 2)
        {
            return val;
        }
    }
    return -1;
}

// Optimised solution O(n.log(n))
int optimiszedSol(vector<int> nums)
{
    int n = nums.size();

    // sort
    sort(nums.begin(), nums.end());

    // freq count
    int freq = 0, ans = nums[0];
    for (int i = 0; i < n; i++)
    {
        if (nums[i] == ans)
        {
            freq++;
        }
        else
        {
            ans = nums[i];
            freq = 1;
        }
        if (freq > n / 2)
        {
            return ans;
        }
    }
    return -1;
}

// Moore's Voting algo O(n)
int mooresAlgo(vector<int> &nums)
{
    int freq = 0, ans = 0 , n= nums.size();
    for (int i = 0; i < n; i++)
    {
        if (freq == 0)
        {
            ans = nums[i];
        }
        if (nums[i] == ans)
        {
            freq++;
        }
        else
        {
            freq--;
        }
    }

    //if there is not any majority element then the following code is executed
            int count = 0;
            for(int val :nums){
                if(val==ans){
                    count++;
                }
            }
            if(count>n/2){
                return ans ;
            }
    return -1;
}

int main()
{

    vector<int> nums = {1, 2, 2, 1, 1};
    int mjEle;

    mjEle = mooresAlgo(nums);

    cout << mjEle << endl;

    return 0;
}