public class EvenOdd {
    static int odd(int x){
        int r = x%2;
        if(r!=0){
            return x ;
        }
        else{
            return 0 ;
        }
    }
    static int even(int x){
        int r = x%2;
        if(r==0){
            return x ;
        }
        else{
            return 0 ;
        }
    }
    public static void main(String[] args) {
        System.out.print("Odd number : ");
        for(int i=1; i<=100;i++){
           int od = odd(i);
           if(od!=0){
           System.out.print(od + " ");
           }
        }
        System.out.println();
        System.out.print("Even number : ");
        for(int i=1; i<=100;i++){
           int ev = even(i);
           if(ev!=0){
           System.out.print(ev + " ");
           }
        }
    }
}
