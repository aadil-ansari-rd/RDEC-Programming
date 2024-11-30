package ForPatterns;

public class P10 {
    
    // * * * * * 
    //   *     *
    //     *   *
    //       * *
    //         *

    public static void main(String[] args) {
        int i , j , k;
        for(i=1;i<=5;i++){
            for(j=1;j<=i-1;j++){
                System.out.print("  ");

            }
            for(k=1;k<=6-i;k++){
                if(k==1 || i ==1 || k==6-i){
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
