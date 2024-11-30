#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int>vec2;
    for(int val:vec2){
        cout<<val<<"  ";
    }
    cout<<endl;
    cout<<"Size of vector : "<<vec2.size()<<endl;
    cout<<"Capacity of vector : "<<vec2.capacity()<<endl;
    vec2.push_back(5);
    for(int val:vec2){
        cout<<val<<"  ";
    }
    cout<<endl;
    cout<<"Size of vector : "<<vec2.size()<<endl;
    cout<<"Capacity of vector : "<<vec2.capacity()<<endl;
    vec2.push_back(4);
    for(int val:vec2){
        cout<<val<<"  ";
    }
    cout<<endl;
    cout<<"Size of vector : "<<vec2.size()<<endl;
    cout<<"Capacity of vector : "<<vec2.capacity()<<endl;
    vec2.push_back(3);
    vec2.push_back(2);
    vec2.push_back(9);
    for(int val:vec2){
        cout<<val<<"  ";
    }
    cout<<endl;
    cout<<"Size of vector : "<<vec2.size()<<endl;
    cout<<"Capacity of vector : "<<vec2.capacity()<<endl;


    return 0 ;
}