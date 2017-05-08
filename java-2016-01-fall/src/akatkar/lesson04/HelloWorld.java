/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson04;

/**
 *
 * @author akatkar
 */
public class HelloWorld {
    
    private String name;
    private int age;
    
    public void displayMessage(){
        System.out.println(name + "(" + age + ")"+ " Hello world");
    }
    
    public HelloWorld(String name){
        this.name = name;
    }
    
    public HelloWorld(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        HelloWorld hh;
        
        hh = new HelloWorld("Ali");
        hh.displayMessage();
        hh = new HelloWorld("Nur");
        hh.displayMessage();
        
        hh = new HelloWorld("Mert", 19);
        hh.displayMessage();
    }
}
