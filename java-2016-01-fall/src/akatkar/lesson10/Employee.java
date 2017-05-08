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
public class Employee {
    String name;
    double salary;

    public Employee(String name) {
        this.name = name;
    }
    
    
    public void display(){
        System.out.println("name:" + name);
    }
}
