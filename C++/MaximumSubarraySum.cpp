#include<iostream>
using namespace std;
int main(){
    int arr[]= {3,-4,5,4,-1,7,-8};
    int n = 7;
    int sum=0 , sumMax = 0;
    for(int st=0;st<n;st++){
        for(int end=st;end<n;end++){
            sum=0;
            for(int i=st;i<=end;i++){
                cout<<arr[i]<<" ";
            }
            cout<<"\t";
        }
        cout<<endl;
    }

    //First approach :: Complexity O(n^3)

    // for(int st=0;st<n;st++){
    //     for(int end=st;end<n;end++){
    //         sum=0;
    //         for(int i=st;i<=end;i++){
    //             sum=sum+arr[i];
    //         }
    //         if(sum>sumMax){
    //             sumMax=sum;
    //         }   
    //     }
    // }



    //Second approach :: Complexity O(n^2)

    // for(int st=0;st<n;st++){
    //      sum=0;
    //     for(int end=st;end<n;end++){
    //         sum+= arr[end];        
    //         sumMax = max(sum,sumMax);
    //     }   
    // }
    

    //Third appraoch : Kadan's algorithm :: Complexity O(n)

    for(int i=0;i<n;i++){
        sum+=arr[i];
        sumMax = max(sum, sumMax);
        if(sum<0){
            sum=0;
        }
    }
    cout<<"Maximum subarray sum :  "<<sumMax<<endl;

    return 0;
}