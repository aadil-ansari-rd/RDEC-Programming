#include<iostream>
#include<vector>
using namespace std;

//Iterative Binary Search
int iterativeBS(vector<int>arr ,int tar){
    int st=0 , end=arr.size()-1;
    while(st<=end){
        int mid = st + (end-st)/2 ;
        if(tar<arr[mid]){
            end=mid-1;
        }else if(tar>arr[mid]){
            st = mid+1;
        }else{
            return mid;
        }
        
    }
    return -1;
}

//Recursive Binary Search
int recursiveBS(vector<int>arr,int tar,int st,int end){
    while(st<=end){
        int mid = st + (end-st)/2 ;
        if(tar<arr[mid]){
            return recursiveBS(arr,tar,st,mid-1);
        }else if(tar>arr[mid]){
            return recursiveBS(arr,tar,mid+1,end);
        }else{
            return mid;
        }
    }
    return -1;
}
int main(){
    vector<int>arr={1,2,3,4,5,6,7};
    int tar =4;

    cout<<iterativeBS(arr,tar)<<endl;
    cout<<recursiveBS(arr,tar,0,arr.size()-1)<<endl;
    return 0;
}