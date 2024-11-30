package Array;

public class Sort0n1 {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,0,1,1,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
