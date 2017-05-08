/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson08;

/**
 *
 * @author akatkar
 */
public class Bicycle extends LandVehicle implements Moveable {

    public Bicycle(int capacity, int velocity, int wheel) {
        super(capacity, velocity, wheel);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("bu nesne " + x + "," + y + " noktasına gitti");
    }

}
