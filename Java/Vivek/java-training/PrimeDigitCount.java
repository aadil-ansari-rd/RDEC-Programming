public class PrimeDigitCount {
    public static void main(String[] args) {
        int number = 545321;
        int f2= 0, f3=0, f5=0, f7=0;
        while (number!=0) {
            int digit = number%10;
            number = number/10;
            if(digit==2){
                f2++;
            }
            if(digit==3){
                f3++;
            }
            if(digit==5){
                f5++;
            }
            if(digit==7){
                f7++;
            }         
        }
        if(f2!=0){
            System.out.println("Occurence of 2 : "+f2);
        }
        if(f3!=0){
            System.out.println("Occurence of 3 : "+f3);
        }
        if(f5!=0){
            System.out.println("Occurence of 5 : "+f5);
        }
        if(f7!=0){
            System.out.println("Occurence of 7 : "+f7);
        }
    }
}
