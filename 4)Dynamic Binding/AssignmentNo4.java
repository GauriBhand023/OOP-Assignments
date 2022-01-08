package Assignments;
import java.util.Scanner;
abstract class Shape {
    double val1, val2;

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        val1 = s.nextDouble();
        System.out.print("Enter the second value: ");
        val2 = s.nextDouble();
    }
    abstract void compute_area();
}
class triangle extends Shape {
    void compute_area(){
        double area;
        area=1.0f/2.0f*val1*val2;
        System.out.print("Triangle Area: "+area);
    }
}
class Rectangle extends Shape {
    void compute_area(){
        double area;
        area=val1*val2;
        System.out.print("Rectangle Area: "+area);

    }
}

public class AssignmentNo4{
    public static void main(String[] args) {
        Shape s;                       // reference variable
        System.out.println("*******Enter the details of triangle*******");
        triangle t = new triangle();
        s = t;                // superclass variable can store the subclass object
        s.input();
        s.compute_area();
        System.out.println("\n\n*******Enter the details of rectangle*******");
        Rectangle r=new Rectangle();
        s=r;
        s.input();
        s.compute_area();
    }
}

