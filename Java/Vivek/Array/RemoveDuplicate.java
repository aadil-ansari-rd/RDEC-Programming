package Array;

public class RemoveDuplicate {
    static void rem(int arr[]){
        int l = arr.length;
        for(int i = 0 ; i< l ; i++){
            for(int j = i ; j<l ; j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                    for(int k =j;k<l-1;k++){
                        arr[k]=arr[k]+arr[k+1];
                        arr[k+1]=arr[k]-arr[k+1];
                        arr[k]=arr[k]-arr[k+1];
                    }
                    j=j-1;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        //rem(arr);
        int l = arr.length;
        for(int i = 0 ; i< l ; i++){
            for(int j = i ; j<l ; j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                    for(int k =j;k<l-1;k++){
                        arr[k]=arr[k]+arr[k+1];
                        arr[k+1]=arr[k]-arr[k+1];
                        arr[k]=arr[k]-arr[k+1];
                    }
                    j=j-1;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
