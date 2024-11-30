class MaxDigitJ{
    public void showMax(){
        int number = 24761;
        int d;
        int max = number%10;
        number = number/10;
        while (number!=0) {
            d = number%10;
            if(d>max){
                max = d;
            }
            number= number/10;
        }
        System.out.println("Max : "+ max);
    }
    public void showMin(){
        int number = 24761;
        int d;
        int min = number%10;
        number = number/10;
        while (number!=0) {
            d = number%10;
            if(d<min){
                min = d;
            }
            number= number/10;
        }
        System.out.println("Min : "+ min);
    }
}
public class MaxDigitMinDigit {
    public static void main(String[] args) {
        MaxDigitJ d = new MaxDigitJ();
        d.showMin();
        d.showMax();
    }
}
