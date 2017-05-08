/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson10;

/**
 *
 * @author akatkar
 */
public class Manager extends Employee{
    
    String department;
    
    public Manager(String name){
        super(name);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("name: Md." + name);
    }
}
