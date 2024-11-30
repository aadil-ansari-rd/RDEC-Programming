#include <iostream>
using namespace std;
int main()
{
    int num;
    bool flag = true;

    cout << "Enter a number ";
    cin >> num;
    while (num > 1)
    {
        int r = num % 2;
        num = num / 2;
        if (r != 0)
        {
            flag = false;
            break;
        }
    }

    if (flag)
    {
        cout << "Power of 2";
    }
    else
    {
        cout << "Not a power of 2";
    }
}