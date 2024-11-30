public class FirstLastDigitAvg {
    public static void main(String[] args) {
        int number = 54532;
        int last = number%10;
        while(number>10){
            number=number/10;
        }
        float avg = (last+number)/2;
        System.out.println("Average is : "+ avg);
    }
}
