import java.util.*;

 public class largest {
    public static int large(int x,int y, int z){
        if( x >y && x>z ){
            return x;
        } else if( y>x && y>z){
            return y;
        }
        else {
           return z;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
         int lar= large(a,b,c);
         System.out.println(lar + " is the largdest number.");




    }
}
