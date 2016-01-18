/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework05;

import java.util.Iterator;

/**
 *
 * @author akatkar
 */
public class MainClass {
    
    public static void main(String[] args) {
        Circle[] list = new Circle[20];
        
        for(int i=0;i<list.length;i++){
            list[i] = new Circle(i*7 + 2);
        }
        
        MyList myList = new MyList(list);
        
        Iterator it = myList.iterator();
        
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        
        for(;it.hasNext();){
            System.out.println(it.next());
        }
        
    }
    
}
