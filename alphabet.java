import java.util.*;
public class alphabet {
    public static void isalpha(char x){
        x=Character.toLowerCase(x);

        if( x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ){
        System.out.println(x+ " is an vowel letter.");
    } else{
            System.out.println(x+ " is a constant letter.");
        }}
        public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
           System.out.println("enter an alphabet");
           char y= sc.next().charAt(0);
           isalpha(y);
        }
}
