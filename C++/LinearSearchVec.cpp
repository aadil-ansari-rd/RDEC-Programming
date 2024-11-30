#include<iostream>
#include<vector>
using namespace std;
void linearSearch(vector<int>&arr, int target){
    for(int i=0;i<arr.size();i++){
        if(target==arr[i]){
            cout<<"Your element is at index : "<<i<<endl;
            break;
        }
        
    }
}
void reverseElement(vector<int>&arr){
    vector<int>arr2;
    
    for(int val : arr){
        
        arr2.push_back(arr.back());
        arr.pop_back();
        
    }
    cout<<"Reversed elements are : ";
    for(int val:arr2){
        cout<<val<<" ";
    }
}
int main(){
    vector<int>arr = {1,2 ,3 ,5 ,6 ,7 ,8 ,12, 23 ,43};
    cout<<"Enter an element that you want to find : ";
    int target;
    cin>>target;
    linearSearch(arr, target);
    reverseElement(arr);



    return 0 ;
}