class Append1{
    public void show(){
        String s1 = "shyam ji waley";
        String s2 = "london ";
        String s3 = "";
        int index = 8 ;
        for (int i = 0 ;i<s1.length();i++){
            s3= s3 + s1.charAt(i);
            if(i==index){
                s3=s3+s2;
            }
        }
        System.out.println(s3);
    }
    public void show2(){
        String s1 = "shyam ji waley";
        String s3 = "";
        for(int i =0 ; i<s1.length();i++){
            if(i<4||i>8){
                s3 = s3 + s1.charAt(i);
            }
        }
        System.out.println(s3);
    }
    public void show3(){
        String s1 = "shyam ji waley";
        String s2 = "";
        for(int i =0 ; i<s1.length();i++){
            char c = s1.charAt(i);
            if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
                s2 = s2 + c;
            }
        }
        System.out.println(s2);
    }
}
public class StrAppendAtIndexN {
    public static void main(String[] args) {
        Append1 a = new Append1();
        a.show();
        a.show2();
        a.show3();
    }
}
