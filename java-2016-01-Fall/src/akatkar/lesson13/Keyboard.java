/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson13;

import java.util.Scanner;

/**
 *
 * @author akatkar
 */
public final class Keyboard {
    
    private final static Scanner scanner = new Scanner(System.in);
            
    private Keyboard(){        
    }
    
    public static int getInt(){
        return scanner.nextInt();
    }
    
    public static String getString(){
        return scanner.next();
    }
}
