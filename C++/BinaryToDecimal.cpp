#include<iostream>
using namespace std;
int main(){
    cout<< "Enter your number";
    int biNum;
    cin>>biNum;
    int r , deNum=0 ,two=1;
    while (biNum!=0)
    {
        r = biNum%10;
        deNum = deNum + two*r;
        biNum= biNum/10;
        two = two*2;
        
    }
    cout<< "Your Decimal number "<< deNum;
    

}