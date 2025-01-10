import java.util.Scanner;
import java.util.*;
import java.util.OptionalDouble;
import java.util.StringJoiner;



public class Account {
      double Accountnumber;
      String Name;
      double Amount;

      Account( Double Accountnumber,String Name,Double Amount){
        this.Accountnumber=Accountnumber;
        this.Name=Name;
        this.Amount=Amount;
    }

   public  void interest(double num, String name, double amt){
    amt=amt*1.08;
    System.out.println("Account number: "+ num);
    System.out.println("Name: " +name );
    System.out.println("Amount after interest :"+ amt);
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the account number of the customer");
        double num =sc.nextDouble();
        System.out.println("Enter the name of the customer");
        String name= sc.next().toString();
        System.out.println("Enter the amount you want to deposit");
        double amt= sc.nextDouble();
        Account ac= new Account(num,name,amt);
        ac.interest(num,name,amt);






    }
}
