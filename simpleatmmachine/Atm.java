package simpleatmmachine;
import java.util.*;
public class Atm{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        
        double balance=5000.00;
        //OPERATE
        System.out.println("WELCOME! LET ME KNOW WHAT YOU WANT? ");
        System.out.println("\n1. CHECK BALANCE \n2. Deposit \n3. Withdraw");
        int operate = sc.nextInt();

        switch (operate){
            case 1:
                checkBalance(balance);
                break;
            case 2:
                System.out.print("How much you want to deposit?");
                double amount =sc.nextInt();
                System.out.print("\nYOUR NEW BALANCE IS: " + deposit(amount,balance));
                break;
            case 3:
                System.out.print("How much you want to withdraw? ");
                double howmuch =sc.nextInt();
                System.out.println("SUCCESSFULLY WITHDRAW YOUR NEW BALANCE IS "+withdraw(howmuch,balance));
                break;
            default:
                System.out.print("OPERATION IS NOT IN THE CHOICES!");
                break;
        }
        sc.close();
    }   static void checkBalance(double balance){
        System.out.println("YOUR BALANCE IS "+ balance);

    }   static double deposit(double amount, double balance){
        return amount += balance;

    }   static double withdraw(double howmuch, double balance){
        
        if(howmuch >= balance){
            System.out.print("\ninsufficient balance!");
        }
        else{
            return howmuch - balance;
    }
    return balance;
    }
}
