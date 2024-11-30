#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int>vec1= {1,3 ,5,6};
    cout<<"Size of vec1 : "<<vec1.size()<<endl;
    cout<<"Capacity of vec1 : "<<vec1.capacity()<<endl;
    vec1.push_back(7);
    vec1.push_back(8);
    vec1.push_back(9);
    for(int val:vec1){
        cout<<val<<"  ";
    }
    cout<<endl;
    vec1.pop_back();
    for(int val:vec1){
        cout<<val<<"  " ;
    }
    cout<<endl;
    cout<<"Fist element : "<<vec1.front()<<endl;
    cout<<"Last element : "<<vec1.back()<<endl;
    //cout<<vec1.front();

    cout<<"Element at index 5 : "<<vec1.at(5);



    return 0 ;
}