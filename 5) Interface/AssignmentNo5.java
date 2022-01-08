package Assignments;
import java.util.Scanner;
interface Vehicles{
    void gearChange(int a);
    void speedUp(int b);
    void applyBreak(int c);
}
class Bicycle implements Vehicles {
    int speed;
    int gear;
    public void gearChange(int newGear){

        gear=newGear;
    }
    public void speedUp(int increment ){

        speed=speed+increment;
    }
    public void applyBreak(int decrement ){

        speed=speed-decrement;
    }
    public void print(){

        System.out.println("speed: "+speed+"\tgear: "+gear);
    }
}
class Car implements Vehicles {
    int speed;
    int gear;
    public void gearChange(int newGear){

        gear=newGear;
    }
    public void speedUp(int increment){

        speed=speed+increment;
    }
    public void applyBreak(int decrement){

        speed=speed-decrement;
    }
    public void print(){

        System.out.println("speed: "+speed+"\tgear: "+gear);
    }
}
class Bike implements Vehicles {
    int speed;
    int gear;
    public void gearChange(int newGear){

        gear=newGear;
    }
    public void speedUp(int increment){

        speed=speed+increment;
    }
    public void applyBreak(int decrement){

        speed=speed-decrement;
    }
    public void print(){

        System.out.println("speed: "+speed+"\tgear: "+gear);
    }

}
public class AssignmentNo5 {
    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.gearChange(2);
        b.speedUp(7);
        b.applyBreak(4);
        System.out.println("present state of bicycle: ");
        b.print();

        Bike s=new Bike();
        s.gearChange(4);
        s.speedUp(8);
        s.applyBreak(2);
        System.out.println("present state of Bike: ");
        s.print();

        Car r=new Car();
        r.gearChange(8);
        r.speedUp(7);
        r.applyBreak(1);
        System.out.println("present state of car: ");
        r.print();
    }
}
