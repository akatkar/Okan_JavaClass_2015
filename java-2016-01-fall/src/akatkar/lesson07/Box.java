/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson07;

/**
 *
 * @author akatkar
 */
public class Box {
    public static int count = 0;
    public int nn=0;
    public Box(){
        count ++;
        nn ++;
    }
    
    public static void main(String[] args) {
        int n = 1000;
        
        for(int i=0;i<n;i++){
            Box box = new Box();
        }
        Box a1 = new Box();
        Box a2 = new Box();
        
//        a1.count = 5;
//        System.out.println("nn:" + a2.count);
        System.out.println("nn:" + a1.nn);
        System.out.println("Nesne sayısı:" + Box.count);
    }
}
