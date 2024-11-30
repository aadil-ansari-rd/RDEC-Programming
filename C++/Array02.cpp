#include<iostream>
using namespace std;
int main(){
    int arr[10];
    
    cout<<"Enter elements " <<endl;
    for(int i=0;i<10;i++){
        cin>>arr[i];
    }
    cout<<"Your array is : "<<endl;
    for(int i=0;i<10;i++){
        cout<<arr[i]<<"  ";
    }
    cout<<endl<< "Unique elements in your array are : \n ";
    for(int i=0;i<10;i++){
        int flag = 1;
        for(int j=0;j<10;j++){
            if(i!=j){
                if(arr[i]==arr[j]){
                flag= 0;
                continue;
                
            }
            }
            
       }
       
       if(flag==1){
            cout<<arr[i]<< "  ";
       }
    } 
    return 0;

}