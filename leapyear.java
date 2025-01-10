import java.util.Scanner;

 public class leapyear {
    public static void leap(int x) {
        if (x % 100 != 0 || x % 400 == 0 || x % 4 == 0) {
            System.out.println(x + " is a leap year.");}
         else {
                System.out.println(x + " isn't a leap year.");
            }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        int year= sc.nextInt();
        leap(year);
    }
}
