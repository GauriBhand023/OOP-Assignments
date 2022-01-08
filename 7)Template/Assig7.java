package Assignments;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;
class collection
{
    public static <T> void getData() {
        int num;
        System.out.print("\n\nEnter the number of elements you want to enter: ");
        Scanner get=new Scanner(System.in);
        num=get.nextInt();
        Object[] n = new Object[num];
        System.out. print("Enter "+num+" input : ");
        for (int i = 0; i < num; i++) {
            n[i]=get.next();

        }
        System.out.println("\n\n************");
        System.out.println("\nArray elements are  :  ");
        for (int i = 0; i < num; i++) {
            System.out.print(" "+ n[i]);
        }
        System.out.println("\n\n************\n");

    }

    public static <T> void evenodd(T a) {
        if((int)a %2==0){
            System.out.println(a + " is Even Number");
        }
        else{
            System.out.println(a + " is Odd Number");
        }
    }

    public static <T> void prime(T a)
    {
        int i, m=0, flag=0;
        int num= (int)a;
        m=num/2;
        if(num==0 || num==1){
            System.out.println(num+" is not prime");
        }
        else{
            for(i=2; i<=m; i++){
                if(num%i==0){
                    System.out.println(num+ " is not prime no.");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(num+" is prime number");
            }
        }
    }

    public static <T> int reverseNum(T a) {
        int num = (int)a;
        int reversedNum = (int)a;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num%10;
            num= num/ 10;
        }
        return reversedNum;
    }

    public static <T> void palindrome(T s) {
        String s1 = (String) s;
        s1 = s1.toLowerCase();
        StringBuffer sb = new StringBuffer(s1);

        String ss = new String(sb.reverse());

        if(Objects.equals(s1,ss)){
            System.out.println(s + " is Palindrome");
        }
        else {
            System.out.println(s + " is not a Palindrome");
        }
    }

    public static <T> void check( T s){
        try{
            int b = Integer.parseInt((String) s);
            System.out.println("We can perform Palindrome,Int array,Check prime");
        }
        catch (NumberFormatException e){
            System.out.println("We can perform Palindrome , String array.");
        }
    }

}

public class Assig7 {
    public static void main(String[] args) {
        int num,ch;
        String s;
        collection c = new collection();


        do {
            System.out.println("\nSelect the Choice from below\n1:String\n2:Integer\n3:Integer Array\n4:String Array\n5:Check\n6.Exit");
            System.out.print("Enter choice :");
            Scanner ob=new Scanner(System.in);
            ch=ob.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("\nEnter the String = ");
                    s = ob.next();
                    c.palindrome(s);
                    break;

                case 2:
                    System.out.print("\nEnter the Integer = ");
                    s = ob.next();
                    c.prime(Integer.parseInt(s));
                    c.evenodd(Integer.parseInt(s));
                    c.palindrome(s);
                    break;

                case 3:
                    c.getData();
                    break;

                case 4:
                    c.getData();
                    break;
                case 5:
                    System.out.print("\nEnter the String = ");
                    s = ob.next();
                    c.check(s);
            }
        }
        while(ch<5);
    }
}