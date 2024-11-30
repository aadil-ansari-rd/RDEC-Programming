#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector<int> arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
    int si = arr.size();
    int p = 0, n = 0;
    vector<int> arr2;
    vector<int> arr3;
    vector<int> arr4;
    for (int val : arr)
    {
        if (val < 0)
        {
            arr2.push_back(val);
        }
        else
        {
            arr3.push_back(val);
        }
    }
    for (int i = 0; i < si; i++)
    {
        if (i % 2 == 0)
        {
            arr4.push_back(arr3[p]);
            p++;
        }
        else
        {
            arr4.push_back(arr2[n]);
            n++;
        }
    }
    for (int val : arr4)
    {
        cout << val << " ";
    }
    return 0 ;
}