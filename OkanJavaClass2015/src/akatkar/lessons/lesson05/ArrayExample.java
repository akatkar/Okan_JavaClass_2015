/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson05;

import akatkar.lessons.lesson06.Example;

/**
 *
 * @author akatkar
 */
public class ArrayExample {
    
    
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5,6};
        
        for(int i=0;i<arr.length;i++){
            System.out.println("i:"+arr[i]);
        }
        arr[5] = 9;        
        
        for(int i:arr){
            System.out.println("i:"+i);
        }
        String s1 = "file";
        String fname = s1 + ".txt";
        System.out.println("fname:"+fname);
        
        s1 += ".txt";
        System.out.println("s1:"+s1);
        
        
        Example ex = new Example();
        ex.public_i = 3;
        
    }
}
