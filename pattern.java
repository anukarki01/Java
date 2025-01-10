import java.util.*;

 public class pattern{
     public static void  pat() {

        //pattern 1
         for (int i = 1; i <= 7; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(j + " ");

         }
             System.out.println();
     }
         System.out.println();

         //pattern2
         for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*"+"\t");
             }
             System.out.println("");
         }
         System.out.println();

         //pattern3

         int row=7;
         for (int i= row; i>= 1; i--)
         {
             for (int j=row; j>i;j--)
             {
                 System.out.print(" ");
             }
             for (int k=1;k<=i;k++)
             {
                 System.out.print("*");
             }
             System.out.println("");
         }

         System.out.println();

         //pattern4
         int rows=9;
         for (int i = 1; i <= rows; i++)
         {
             for (int j = rows; j >= i; j--)
             {
                 System.out.print(j+" ");
             }
             System.out.println();
         }
     }
     public static void main(String[] args)
     {
         pat();
     }
}
