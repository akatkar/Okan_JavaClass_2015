/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson08;

import java.awt.Color;

/**
 *
 * @author akatkar
 */
public class MainClass {
    
    private static void print(Vehicle vehicle){
        System.out.print("Capacity:"+ vehicle.getCapacity());
        System.out.println(" Velocity"+vehicle.getVelocity());
    }
    
    private static void move(Vehicle m){
        m.move(6, 7);
    }
    
    public static void main(String[] args) {
        Bicycle bi = new Bicycle(1, 30, 2 );
        Car car = new Car(2015, 1600,Color.PINK,"Porsche",5,300,4);
        Car car2 = new Car(1995, 1400,Color.WHITE,"Toros",5,160,4);
        
        //MainClass m = new MainClass();
        print(car);
        
        print(car2);
        print(bi);
        
        move(bi);
        move(car);
}
}
