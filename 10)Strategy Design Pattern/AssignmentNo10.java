package Assignments;
import java.util.Scanner;
import static java.lang.Thread.sleep;
abstract class Car_Factory{
    String company,car_name;
    double budget;

    abstract void getPrice(double price);
    abstract void detail(String company_name,String car_name);
    abstract void accessories();

    void input() {
        Scanner scan =new Scanner (System.in);
        System.out.print("Company:   ");
        company =scan.next();
        System.out.print("Car:   ");
        car_name=scan.next();
        System.out.print("Rough Budget(in Lakhs):   ");
        budget=scan.nextDouble();
    }
    void display(Car_Factory obj1) {
        obj1.getPrice(budget);
        obj1.detail(company, car_name);
        obj1.accessories();
    }
}
class Small_car extends Car_Factory{
    String Ans;
    public void getPrice(double price) {
        if(price>2&&price<5)
            Ans="No";
        else
            Ans="Yes";
    }
    public void detail(String company_name,String car_name) {
        System.out.println("\n");
        System.out.println("Company:  "+company_name);
        System.out.println("Name of Car:  "+car_name);
        System.out.println("Color: Black/White/Orange/Red");
        System.out.println("Fuel:  Petrol");
        System.out.println("Gears:  Manual");
    }
    public void accessories() {
        System.out.println("Types of Tyres- Alloy Wheels");
        System.out.println("Airbags:  "+Ans);
        System.out.println("Back Wiper:  "+Ans);
        System.out.println("Side Mirror:  Two");
        System.out.println("Touch Screen Music Player:  "+Ans);
    }
}
class Sedan extends Car_Factory{
    String Ans;
    public void getPrice(double price) {
        if(price>6 && price<10)
            Ans="No";
        else
            Ans="Yes";
    }
    public void detail(String company_name,String car_name) {
        System.out.println("\n");
        System.out.println("Company:  "+company_name);
        System.out.println("Name of Car:  "+car_name);
        System.out.println("Color:  Black/White/Orange/Red");
        System.out.println("Fuel:  Petrol/Diesel");
        System.out.println("Gears:  Auto/Manual");
    }
    public void accessories() {
        System.out.println("Types of Tyres: Alloy Wheels");
        System.out.println("Airbags: YES");
        System.out.println("Back Wiper: YES");
        System.out.println("Side Mirror: Two");
        System.out.println("Touch Screen Music Player: YES");
        System.out.println("Roof Window: "+Ans);
    }
}
class Luxary extends Car_Factory{
    String Ans;
    public void getPrice(double price) {
        if(price>10 && price<14)
            Ans="No";
        else
            Ans="Yes";
    }
    public void detail(String company_name,String car_name) {
        System.out.println("\n");
        System.out.println("Company:  "+company_name);
        System.out.println("Name of Car:  "+car_name);
        System.out.println("Color:  Black/White/Orange/Red");
        System.out.println("Fuel:  Diesel");
        System.out.println("Gears:  Auto");
    }
    public void accessories() {
        System.out.println("Types of Tyres: Alloy Wheels");
        System.out.println("Airbags: YES");
        System.out.println("Back Wiper: YES");
        System.out.println("Side Mirror: Two");
        System.out.println("Touch Screen Music Player: YES");
        System.out.println("Roof Window: YES");
        System.out.println("Automotive Garbage Cans:  "+Ans);
        System.out.println("Automotive Air Freshener:  "+Ans);
        System.out.println("Button Start:  "+Ans);
    }
}
public class AssignmentNo10 {
    static void timeDelay(long t) {
        System.out.println("\nConfiguration Loading .....\n");
        try {
            Thread.sleep(t);
        }
        catch (InterruptedException e) {
        }
        System.out.println("\n******");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch;
        boolean flag = true;
        double bud;
        Car_Factory obj;
        while (flag){
            System.out.println("\n\t\tWELCOME\n\n");
            System.out.println("WE have\n1.Small car\n2.Sedan car\n3.Luxury car\n");
            System.out.println("Lets decide best type of car for your budget!");
            System.out.print("Enter the budget = ");
            bud = scan.nextDouble();

            if(bud<2){
                System.out.println("\nLow budget!!! No cars available\n");
            }
            while(bud>2) {
                if (bud >= 2.0 && bud <= 6.0) {
                    System.out.println("\n\nSmall cars are suitable for your price range\n");
                    obj= new Small_car();
                    obj.input();
                    timeDelay(3000);
                    obj.display(obj);
                    break;
                }
                if(bud>=6 && bud<=10){
                    System.out.println("\n\nYou can go for small as well as sedan cars\n");
                    int choice;
                    System.out.print("1.Small car\n2.Sedan car\nEnter your choice = ");
                    choice = scan.nextInt();
                    System.out.println("\n");
                    if(choice==1){
                        obj= new Small_car();
                        obj.input();
                        timeDelay(3000);
                        obj.display(obj);
                        break;
                    }
                    else{
                        obj= new Sedan();
                        obj.input();
                        timeDelay(3000);
                        obj.display(obj);
                        break;
                    }
                }
                if(bud>=10 ){
                    System.out.println("\n\nYou can go for small ,Sedan as well as Luxary cars\n");
                    int choice;
                    System.out.print("1.Small car\n2.Sedan car\n3.Luxury car\nEnter your choice = ");
                    choice = scan.nextInt();
                    System.out.println("\n");
                    if(choice==1){
                        obj= new Small_car();
                        obj.input();
                        timeDelay(3000);
                        obj.display(obj);
                        break;

                    }
                    else if(choice==2){
                        obj= new Sedan();
                        obj.input();

                        timeDelay(3000);
                        obj.display(obj);
                        break;
                    }
                    else{
                        obj= new Luxary();
                        obj.input();

                        timeDelay(3000);
                        obj.display(obj);
                        break;
                    }
                }
            }
            System.out.print("\nWant to exit ( y,Y or n,N ) = ");
            char  reply;
            reply = scan.next().charAt(0);
            if(reply == 'y' || reply=='Y'){
                flag = false;
            }
        }
    }
}
