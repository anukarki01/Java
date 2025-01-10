import java.util.Scanner;

public class marks {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 Subjects:");
        int Java=sc.nextInt();
        int C=sc.nextInt();
        int Dbms=sc.nextInt();
        int DSA=sc.nextInt();
        int Math=sc.nextInt();
        int totalmarks = Java+C+Dbms+DSA+Math;
        int percentage= totalmarks/5;
        if(Java>=40 && C>=40 && Dbms>=40 && DSA>=40 && Math>=40){
            System.out.println("Result: passed");
        }
        else {
            System.out.println("Result : failed");
        }
        System.out.println("Marks obtained:"+ totalmarks);
        System.out.println("Percentage:"+ percentage+"%");
    }
}
