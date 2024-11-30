package Array;

public class MissingNum {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,6,7};
        int n=1;
        for(int i =0 ; i< num.length ; i++){
            if(num[i]!=n){
                System.out.println("Missing Number is :  "+ n);
                break;
            }
            n++;
        }
    }
}
