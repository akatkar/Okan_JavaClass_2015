/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson06;

/**
 *
 * @author akatkar
 */
public class Example2 {

    private int myVariable;

    public int getMyVariable() {
        return myVariable;
    }

    public void setMyVariable(int myVariable) {
        this.myVariable = myVariable;
    }
    
    
    
    public static void main(String[] args) {
        Example ex = new Example();
        
        ex.default_i = 3;
        ex.protected_i = 4;
        ex.public_i = 5;
    }
}
