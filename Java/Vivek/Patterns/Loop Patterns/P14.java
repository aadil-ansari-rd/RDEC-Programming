package ForPatterns;

public class P14 {

    //    ****
    //   *  *
    //  *  *
    // ****

    public static void main(String[] args) {
        int i, j, k ;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print("  ");
            }
            for(k=1;k<=4;k++){
                if(i==1|| i==4 ||k==1||k==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }   
    }
}
