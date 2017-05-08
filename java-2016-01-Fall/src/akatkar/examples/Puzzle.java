/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.examples;

/**
 *
 * @author akatkar
 */
public class Puzzle {
    // 1 + 4 = 5
    // 2 + 5 = 12
    // 3 + 6 = 21
    // 8 + 11 = ?
    public static int function(int a, int b){
        return a * b + a;
    }
    
    public static void main(String[] args) {
        int[][] values = {{1,4},{2,5},{3,6},{8,11},{12,16}};
        
        for(int[] v:values){
            int a = v[0];
            int b = v[1];
            System.out.println(a + " + " + b + " = " + function(a, b));
        }
        
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("deneme");   
            }
        };
        
        new Thread(runnable).start();
    }
    
}
