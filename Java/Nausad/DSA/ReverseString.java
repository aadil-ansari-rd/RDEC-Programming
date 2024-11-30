public class ReverseString {
    public static void main(String[] args) {
        String name = "Shyam";
        String reverse = "";
        int len = name.length() -1;
        for(int i = len ; i>=0;i--){
            reverse= reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }
}
