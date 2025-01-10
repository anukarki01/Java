import java.security.PublicKey;
import java.util.*;
 public class jump {
  public static int add(int a, int b)
  {
   return a+b;
  }
  public static void main(String[] args) {
   int x = 9;
   //break statement
   for (x = 1; x < 10; x++) {
    if (x==5){
     break;
    }
    else{
     System.out.print(x+" ");
    }
   }
   System.out.println();

   //continue statement
   for(x=1;x<=9;x++){
    if(x==4){
     continue;
    }
    else{
     System.out.print(x+" ");
    }
   }
   System.out.println();


   // return statement
   int p=1;
   int q=3;
   System.out.println("addition is : " +add(p,q));
  }
}
