#include<iostream>
using namespace std;
int main(){
    int arr[5], brr[5];
     int c[5], ind=0;
    cout<<"Enter the elements in array 1 "<<endl;;
    for(int i=0;i<5;i++){
        cin>>arr[i];
    }
    cout<<"Enter the elements in array 2 "<<endl;
    for(int i=0;i<5;i++){
        cin>>brr[i];
        
    }
    cout<<"Array 1 : "<<endl;
    for(int i=0;i<5;i++){
        cout<<arr[i]<< "  ";
    }
    
    cout<<endl<<"Array 2 : "<<endl;
    for(int i=0;i<5;i++){
        cout<<brr[i]<< "  ";
    }
    
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(arr[i]==brr[j]){
                c[ind]= arr[i];
                ind++;
                
            }
       }
    }
    
    cout<<endl<<"Intersection array : "<<endl;
    for(int i=0;i<ind;i++){
        cout<<c[i]<< "  ";
    }

    
    return 0;
}