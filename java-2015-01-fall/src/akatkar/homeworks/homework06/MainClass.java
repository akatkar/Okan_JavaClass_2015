/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework06;

/**
 *
 * @author akatkar
 */
public class MainClass {
    
    public static void main(String[] args) {
       Shape[] shapeArray;
       
       shapeArray = new Shape[7];
       
       shapeArray[0] = new Circle(2.0);
       shapeArray[1] = new Circle(2.4);
       shapeArray[2] = new Circle(5);
       shapeArray[3] = new Rectangle(2,4);
       shapeArray[4] = new Rectangle(4,3);
       shapeArray[5] = new Rectangle(6,4);
       shapeArray[6] = new Rectangle(7,5);
       
       for(Shape current:shapeArray){
           System.out.print("Çevre:" + current.perimeter());
           System.out.println(" Alan:" + current.area());
       }
       
    }
    
}
