package Assignments;

import java.util.Scanner;

public class AssignmentNo1 {
    public static void main(String args[]) {
        int ch = 0;
        float num1, num2, answer;
        Complex cal = new Complex();
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("\t1.Add");
            System.out.println("\t2.Subtract");
            System.out.println("\t3.Multiplication");
            System.out.println("\t4.Division");
            System.out.println("\t5.Exit");
            System.out.print("\nEnter the choice --> ");
            ch = input.nextInt();
            if(ch>0 && ch <5) {
                System.out.print("\nEnter the first Number\n");
                System.out.print("Real Part = ");
                num1 = input.nextInt();
                System.out.print("Imaginary Part = ");
                num2 = input.nextInt();
                Complex First = new Complex(num1, num2);

                System.out.print("\nEnter the Second Number\n");
                System.out.print("Real Part = ");
                num1 = input.nextInt();
                System.out.print("Imaginary Part = ");
                num2 = input.nextInt();
                Complex Second = new Complex(num1, num2);


                switch (ch) {
                    case 1:
                        cal.AddNumbers(First, Second);
                        break;
                    case 2:
                        cal.SubtractNumbers(First, Second);
                        break;
                    case 3:
                        cal.MultiplyNumbers(First, Second);
                        break;
                    case 4:
                        cal.DivideNumbers(First, Second);
                        break;
                    case 5:

                }
            }
            else if(ch==5 && ch>4 && ch<6){
                System.out.println(" ");
            }
            else{
                System.out.println("\nEnter valid choice!!\n\n");
            }

        }while (ch != 5) ;


    }
}

class Complex
{
    private float real,imag;
    Complex()                        // default constructor
    {
        real=0;
        imag=0;
    }
    Complex(float Comp1,float Comp2)          // parameterised constructor
    {
        real=Comp1;
        imag=Comp2;
    }
    void   CollectNumbers(){

    }
    void  AddNumbers(Complex C1,Complex C2)
    {
        float real,imag;
        this.real = (C1.real + C2.real);
        this.imag = (C1.imag + C2.imag);
        System.out.println("\nAnswer is --->  "+this.real+" + "+this.imag+" i\n" );
    }
    void SubtractNumbers(Complex C1,Complex C2)
    {
        float real,imag;
        this.real = (C1.real - C2.real);
        this.imag = (C1.imag - C2.imag);
        System.out.println("\nAnswer is --->  "+this.real+" + "+this.imag+" i\n" );
    }
    void MultiplyNumbers(Complex C1,Complex C2)
    {
        float real,imag;
        this.real = (C1.real*C2.real - C1.imag*C2.imag);
        this.imag = (C1.real*C2.imag + C2.real*C1.imag);
        System.out.println("\nAnswer is --->  "+this.real+" + "+this.imag+" i\n" );
    }
    void DivideNumbers(Complex C1,Complex C2)
    {
        float real,imag,deno;
        deno = (C2.real*C2.real + C2.imag*C2.imag);
        this.real = (C1.real*C2.real + C1.imag*C2.imag)/deno;
        this.imag = (C2.real*C1.imag - C1.real*C2.imag)/deno;
        System.out.println("\nAnswer is --->  "+this.real+" + "+this.imag+" i\n" );
    }
}
