/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author akatkar
 */
public class GenericsDemo {
    public static void printList(List<String> list){
        for(String s:list){
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("String");
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ali");
        map.put(2, "Veli");
        
        HashMap<Integer, Box> boxMap = new HashMap<>();
        Box b = new Box(2,3);
        boxMap.put(b.hashCode(), b);
        
            
        String s = map.get(1);
        System.out.println("s:" + s);
        
    }
   
}
