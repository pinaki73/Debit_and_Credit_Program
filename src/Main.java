import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Account a1 = new Account(1000);
       System.out.println("The initial account balance is = "+a1.getAccountBalance());
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount to be withdrawl");
       double withdrawl = sc.nextDouble();
       System.out.println("An amount of " +withdrawl+ "will be debited from the account");
       a1.debit(withdrawl);
       System.out.println("The present account balance is = " +a1.getAccountBalance());
    }
}