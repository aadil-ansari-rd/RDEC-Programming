#include<iostream>
using namespace std;
int main(){
    cout<< "Enter your number";
    int deNum;
    cin>>deNum;
    int r , biNum=0 ,ten=1;
    while (deNum!=0)
    {
        r = deNum%2;
        biNum = biNum + ten*r;
        deNum= deNum/2;
        ten = ten*10;
        
    }
    cout<< "Your bi number "<< biNum;
    

}