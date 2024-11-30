package ForPatterns;

public class P9 {

    // * * * * * 
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void main(String[] args) {
        int i , j , k;
        for(i=1;i<=5;i++){
            for(j=1;j<=i-1;j++){
                System.out.print("  ");

            }
            for(k=1;k<=6-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
