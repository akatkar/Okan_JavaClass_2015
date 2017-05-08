/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework08;

/**
 *
 * @author akatkar
 */
public class Circle extends Shape{
    
    public static final double PI = 3.14;
    
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
