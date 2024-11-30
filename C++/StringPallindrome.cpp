#include <iostream>
#include <string>
using namespace std;

bool isPallindrome(string s)
{
    int st = 0, end = s.length() - 1;

    while (st < end)
    {
        if (s[st++] != s[end--])
        {
            return false;
        }
    }
    return true;
}
int main()
{

    string s1;
    cout << "Enter a string" << endl;
    getline(cin, s1);

    if (isPallindrome(s1))
    {
        cout << "Given string is pallindrome string";
    }
    else
    {
        cout << "Given string is not pallindrome string";
    }

    return 0;
}