#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter a number : ";
    cin>> num;
    int num2 = num>>1;
    if(num == 2*num2){
        cout<< "Power of 2";
    }
    else{
        cout << "NOt power of 2";
    }

}