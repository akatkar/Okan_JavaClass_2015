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
public abstract class LandVehicle extends Vehicle{

    private int wheel;

    public LandVehicle(int capacity, int velocity, int wheel) {
        super(capacity, velocity);
        this.wheel = wheel;
    }
    

    
}
