package ForPatterns;

public class P13 {

    //    ****
    //   ****
    //  ****
    // ****

    public static void main(String[] args) {
        int i, j, k ;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print("  ");
            }
            for(k=1;k<=4;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
