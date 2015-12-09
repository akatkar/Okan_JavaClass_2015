/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akatkar
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Bu bir Stringdir");
 //       myList.add(new Integer(10));
        
        for(String s:myList){
            System.out.println(s);
        }
    }
    
}
