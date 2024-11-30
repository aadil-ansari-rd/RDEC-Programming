package Array;

public class MajorityElement {
    public static void main(String[] args) {
        //int[] arr = {0,1,1,0,0,1,1,1};
        int arr[] = { 5, 2, 5, 6, 4, 5, 5, 4, 5, 5 };
        int check = (arr.length)/2 ;
        int majorityElement = 0 ;
        for(int i=0; i<arr.length; i++){
            int count =0;
            for(int j=0; j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>check){
                majorityElement = arr[i];
                break;
            }

        }
        System.out.println("Majority element is : "+ majorityElement);
    }
}
