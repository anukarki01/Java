import java.util.*;
public class mathematicaloperations{
    public static int add( int x, int y){
        return x+y;
    }
    public static int sub( int x, int y){
        return x-y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
    public static int division(int x, int y){
        if (y==0){
            System.out.println("Can't be divided by zero.");
            return 0;
        }else{
        return x/y;
    }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter operations:" );
        System.out.println  (  "a.add");
        System.out.println ("b.Subtract");
        System.out.println  ( "c.Multiply" );
        System.out.println ("d.Division");
        char operations = sc.next().charAt(0);

        switch (operations) {
            case 'a':
                System.out.println("Addition:" + add(num1, num2));
                break;

            case 'b':
                System.out.println("Subtarction:" + sub(num1, num2));
                break;

            case 'c':
                System.out.println("Multiplication:" + multiply(num1, num2));
                break;

            case 'd':
                System.out.println("Division:" + division(num1, num2));
                break;

            default:
                System.out.println("Invalid choice....");
                System.exit(0);
        }
    }}








