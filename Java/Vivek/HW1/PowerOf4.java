package HW1;

public class PowerOf4 {
    static boolean isPower(int n){
        if(n<=0){
            return false;
        }
        else if (n==1){
            return true;
        }
        else if(n%4!=0){
            return false;
        }
        return isPower(n/4);
    }
    public static void main(String[] args) {
        System.out.println(isPower(64));
    }
}
