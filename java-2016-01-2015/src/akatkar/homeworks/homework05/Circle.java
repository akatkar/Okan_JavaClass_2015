/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework05;

/**
 *
 * @author akatkar
 */
public class Circle {
    public static final double PI = 3.1459;
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double perimeter(){
        return 2 * PI * radius;
    }
    
    public double area(){
        return PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);
        
        double perimeter = circle1.perimeter();
        double area = circle2.area();
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}
