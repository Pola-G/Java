
package sheet_6_3;

import static java.lang.Math.pow;
import java.util.Scanner;


public class Sheet_6_3 {

    public static void main(String[] args) {
        double radius,height;
        Cylinder cc=new Cylinder();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter radius: ");
         radius=sc.nextDouble();
         cc.setRadius(radius);
         
         System.out.println("Enter color: ");
         String color=sc.next();
         cc.setColor(color);
       
         System.out.println("Enter height: ");
         height=sc.nextDouble();
         cc.setHeight(height);
         
        System.out.printf("Cylider volume = %4.3f",cc.getVolume());
    }
}

class Circle{
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    public double getArea(){
       return Math.PI*pow(radius,2);
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    public double getVolume(){
       return super.getArea()*this.height;
    }
    
 
}