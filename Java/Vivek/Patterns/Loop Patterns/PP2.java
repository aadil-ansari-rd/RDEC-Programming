package ForPatterns;

public class PP2 {

    // 1
    // 22
    // 333
    // 4444
    // 55555
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
