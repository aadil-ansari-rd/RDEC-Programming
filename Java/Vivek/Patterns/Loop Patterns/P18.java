package ForPatterns;

public class P18 {
    
    // *********
    //  *     *
    //   *   *
    //    * *
    //     *

    public static void main(String[] args) {
        int i , j,k,l ;
        for(i=1;i<=5;i++){
            for(j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(k=1;k<=6-i;k++){
                if(i==1||k==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(l=1;l<=5-i;l++){
                if(i==1||l==5-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // for(i=1;i<=5;i++){
        //     for(j=1;j<=i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(k=1;k<=6-i;k++){
        //         System.out.print("* ");
        //     }
        //     for(l=1;l<=5-i;l++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
