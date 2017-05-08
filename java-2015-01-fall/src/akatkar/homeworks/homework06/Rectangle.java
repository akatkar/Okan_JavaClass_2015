/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework06;

/**
 *
 * @author akatkar
 */
public class Rectangle extends Shape {

    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }    
}
