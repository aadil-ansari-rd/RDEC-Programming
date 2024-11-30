public class CountDigitINNumber {
    public static void main(String[] args) {
        int number = 54531;
        int count = 0;
        while(number!=0){
            number = number/10;
            count++;
        }
        System.out.println("Number of digits : "+ count);
    }
}
