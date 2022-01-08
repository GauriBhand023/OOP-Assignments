package Assignments;
import java.util.Scanner;
class exception{
    void arithmeticException(){
        Scanner sc=new Scanner(System.in);
        boolean valid;     //initialize tem variable declaration
        valid=false;
        while(!valid){
            try{
                System.out.print("Enter first number: ");
                int num1=sc.nextInt();
                System.out.print("Enter second number: ");
                int num2=sc.nextInt();
                double c=num1/num2;
                System.out.println("Division is: "+c);
                valid=true;              //change the value of variable
            }
            catch(Exception e){
                System.out.println("cannot divide by zero :"+e);
            }
        }
    }
    void ArrayOutBond(int  [] arr){
        Scanner sc=new Scanner(System.in);
        boolean valid;
        valid=false;
        while(!valid){
            try{
                System.out.print("Enter index of element which you want to print: ");
                int a=sc.nextInt();
                System.out.println(arr[a]+" is present at given index");
                valid =true;
            }
            catch(Exception e){
                System.out.println("Invalid index please try again: "+e);
            }
        }
    }
    void NumberFormat(){
        Scanner sc=new Scanner(System.in);
        boolean valid;
        valid=false;
        while(!valid){
            try{
                System.out.print("Enter the first number: ");
                String num1=sc.next();
                System.out.print("Enter second number: ");
                String num2=sc.next();
                int d=Integer.parseInt(num1);
                int a=Integer.parseInt(num2);
                System.out.println("Entered numbers are integers: "+d+" , " +a);
                valid=true;
            }
            catch(Exception e){
                System.out.println("Numbers you have entered are not integers: "+e);
            }
        }
    }
}
public class AssignmentNo6 {
    public static void main(String[] args) {
        exception e=new exception();
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("\n\t1)Arithmetic exception"
                    +"\n\t2)Array out of bound"
                    +"\n\t3)Number format"
                    +"\n\t4)Exit");
            System.out.print("Enter your choice: ");
            n=sc.nextInt();
            switch(n){
                case 1:
                    e.arithmeticException();
                    break;
                case 2:
                    int[] arr={1,2,3,4,5,6,8};
                    e.ArrayOutBond(arr);
                    break;
                case 3:
                    e.NumberFormat();
                    break;
                case 4:
                    n=0;
                    break;
                default:
                    System.out.println("Invalid input!!!");
            }
        }while(n!=0);
    }
}
