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
public class MainClass {
    public static void main(String[] args) {
        
        List<String> myPool = new ArrayList<String>(20);
        
        
     //   GenericArray<Integer> arrayI = new GenericArray<Integer>();
        GenericArray<String> arrayS = new GenericArray<String>(100, myPool);
        
    }
}
