// wap to find out the largest character of an alphabet in a given string
class Alphabet{
    public void showMax(){
        String name = "shyamzi";
        char p = name.charAt(0);
        for(int i=1;i<name.length();i++){
            char t = name.charAt(i);
            if(t>p){
                p=t;
            }
        }
        System.out.println("Last letter in alphabet : "+ p);

    }
    public void showMin(){
        String name = "shyamzi";
        char p = name.charAt(0);
        for(int i=1;i<name.length();i++){
            char t = name.charAt(i);
            if(t<p){
                p=t;
            }
        }
        System.out.println("Least letter in alphabet : "+ p);

    }
    public void append(){
        String s = "";
        for(int i=0; i<5;i++){
            s = s+'a';
        }
        System.out.println(s);
    }
}
public class G8NSmallCharInStr {
    public static void main(String[] args) {
       Alphabet a = new Alphabet();
       a.showMax();
       a.showMin();
       a.append(); 
    }  
}
