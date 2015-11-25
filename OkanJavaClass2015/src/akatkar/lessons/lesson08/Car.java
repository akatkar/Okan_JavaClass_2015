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
public class Car extends LandVehicle implements Moveable{

    private int model;
    private int motor;
    private Color color;
    private String brand;

    public Car(int model, int motor, Color color, String brand, int capacity, int velocity, int wheel) {
        super(capacity, velocity, wheel);
        this.model = model;
        this.motor = motor;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("bu nesne "+ x + ","+y+ " noktasına gitti");
    }
    


    

}
