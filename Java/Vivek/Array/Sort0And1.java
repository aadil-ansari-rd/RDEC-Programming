package Array;

public class Sort0And1 {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 0, 1, 1, 1 };
        int zeroCount = 0;
        for (int val : arr) {
            if (val == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }
}
