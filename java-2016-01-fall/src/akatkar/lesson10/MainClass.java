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
public class MainClass {
    
    public static void display(Employee emp){
        emp.display();
    }
    
    public static void main(String[] args) {
        Employee e = new Employee("Mert");
        Manager m = new Manager("Batuhan");
        Manager m2 = new Manager("Hüseyin");
        
        
        e.display();
        m.display();
        m2.display();
        
        display(e);
        display(m);
        display(m2);
    }
}
