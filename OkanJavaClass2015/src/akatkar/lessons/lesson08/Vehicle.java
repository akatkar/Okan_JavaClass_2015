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
public abstract class Vehicle {
    
    private int capacity;
    private int velocity;
    
    
    
    public Vehicle(int capacity, int velocity){
        this.capacity = capacity;
        this.velocity = velocity;
    }
        
    public int getCapacity(){
        return capacity;
    }

    public int getVelocity() {
        return velocity;
    }
    
    public abstract void move(int x, int y);
}
