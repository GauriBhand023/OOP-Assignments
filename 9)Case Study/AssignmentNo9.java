package Assignments;
import java.util.Scanner;
class Bank1 {
    private String accno;
    private String name;
    private long balance;
    private int customerAge;
    private String accountType;

    Scanner sc = new Scanner(System.in);
    void openAccount() {
        System.out.print("Enter Account No =  ");
        accno = sc.next();
        System.out.print("Enter your age=   ");
        customerAge=sc.nextInt();
        if(customerAge<18){
            do{
                System.out.print("Minimum age should be 18 to create an account.\nPlease enter valid age=  ");
                customerAge=sc.nextInt();
            }while(customerAge<18);
        }
        System.out.print("Enter Name    =");
        name = sc.next();
        System.out.print("Enter Balance    =");
        balance = sc.nextLong();
        System.out.print("Enter your account type   =");
        accountType=sc.next();
    }
    void showAccount() {
        System.out.println("\n**************\n");
        System.out.println("\nAccount No = " + accno +
                "\n" + "Name = " + name +
                "\nBalance = " + balance +
                "\nage="+customerAge+
                "\naccount type="+accountType);
        System.out.println("\n**************\n");
    }
    void deposit() {
        long amt;
        System.out.print("\nEnter Amount you want to Deposit = ");

        amt = sc.nextLong();
        balance = balance + amt;
        System.out.println("\n***Amount deposited successfully ***");
    }
    void withdrawal() {
        long amt;
        System.out.print("Enter Amount you want to withdraw = ");
        amt = sc.nextLong();
        if (balance >= amt) {
            if(balance-amt>=1000) {
                balance = balance - amt;
                System.out.println("\n** Transaction done Successfully **\n");
            }
            else{
                System.out.println("\n** Cannot withdraw more than minimum balance **");
            }
        }
        else {
            System.out.println("\n** Less Balance..Transaction Failed.. **");
        }
    }
    boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
public class AssignmentNo9 {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nHow Many Accounts you want to create : ");
        int n = s.nextInt();
        Bank1 C[] = new Bank1[n];
        for (int i = 0; i < C.length; i++) {
            System.out.println("\nAccount no "+(i+1));
            C[i] = new Bank1();
            C[i].openAccount();
        }
        int ch;
        do {
            System.out.println("\nMain Menu\n 1]Display All\n 2]Search Account\n 3]Deposit\n 4]Withdrawal\n 5]Exit ");
            System.out.print("Your Choice = ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    System.out.println("\n** Accounts Created Successfully **");
                    break;
                case 2:
                    System.out.print("Enter Account No you want to Search = ");
                    String acn = s.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("* Search Failed..Account Not Exist *");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No = ");
                    acn = s.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("* Search Failed..Account Not Exist *");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No = ");
                    acn = s.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("* Search Failed..Account Not Exist *");
                    }
                    break;
                case 5:
                    System.out.println("Thank You");
                    break;
            }
        } while (ch != 5);
    }
}
