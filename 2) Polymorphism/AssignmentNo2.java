package Assignments;

import java.util.Scanner;
abstract class Publication {
    String title;
    int  price,copies,quantity;
    abstract void saleCopy();

    void setPrice(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter title: ");
        title=sc.next();
        System.out.print("enter price: ");
        price=sc.nextInt();
        System.out.print("enter copies: ");
        copies=sc.nextInt();
    }
    void display(){

        System.out.println(title+"\t"+price+"\t"+copies);
    }
}

class Book extends Publication
{
    String author;

    void saleCopy() {
        System.out.println("******************************************");
        System.out.println("Book name: "+title);
        System.out.println("Author name: "+author);
        System.out.println("price per book: "+price);
        System.out.println("copies ordered: "+copies);
        System.out.println("\n*******Total sales:"+(copies)*price);
    }
    void setAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("author name: ");
        author=sc.next();

    }
    void orderQty(){
        System.out.print(" quantity of book is:");
        Scanner sc=new Scanner(System.in);
        quantity=sc.nextInt();
    }

    void display_Book(){
        display();
        System.out.println("\t"+author);
    }
}

class Magazine extends Publication
{
    String currIssue;

    void saleCopy() {
        System.out.println("*************************************************");
        System.out.println("magazine name: "+title);
        System.out.println("price per magazine: "+price);
        System.out.println("copies ordered: "+copies);
        System.out.println("\n******Total Sales: "+(copies)*price);
    }

    void issue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Issue: ");
        currIssue=sc.next();
    }
    void orderQty(){
        System.out.print("enter quantity of magazine :");
        Scanner sc=new Scanner(System.in);
        quantity=sc.nextInt();
    }
    void display_magazine(){

        display();
    }
    void receiveIssue(){

        System.out.println("You will receive magazine in "+currIssue);
    }
}
public class AssignmentNo2 {
    public static void main(String[] args){
        Book b = new Book();
        b.setPrice();
        b.setAuthor();
        b.orderQty();
        b.saleCopy();

        Magazine m = new Magazine();
        m.setPrice();
        m.issue();
        m.receiveIssue();
        m.orderQty();
        m.saleCopy();
    }
}

