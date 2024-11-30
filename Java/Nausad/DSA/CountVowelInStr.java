class MyString {
    public void show(){
        String k = "Shyam is a good shivani";
        int count =0;
        String rev = "";
        for(int i=0;i<k.length();i++){
            char p = k.charAt(i);
            if(p=='a'|| p=='e'||p=='i'||p=='o'||p=='u'){
                count++;
            }
        }
        System.out.println(count);

        for(int j= k.length() - 1;j>=0;j--){
            rev = rev + k.charAt(j);

        }
        System.out.println(rev);
        
    }
}
public class CountVowelInStr{
    public static void main(String[] args) {
        MyString k = new MyString();
        k.show();
    }
}
