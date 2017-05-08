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
public class MainClass {
    public static void main(String[] args) {
        Shape shape = new Circle(5.0);
        
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
