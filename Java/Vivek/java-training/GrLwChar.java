public class GrLwChar {
    public static void main(String[] args) {
        String name = "rahat";
        char gr = 'a';
        char lw='a';
        int len = name.length() -1 ;
        for(int i =len ; i>=0 ; i--){
            char com = name.charAt(i);
            if(com>gr){
                gr = com ;
            }
            if(com<lw){
                lw = com ;
            }
        }
        System.out.println("Greatest Alphabet : "+ gr);
        System.out.println("lowest Alphabet : "+ lw);
    }
}
