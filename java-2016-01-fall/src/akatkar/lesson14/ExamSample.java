/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson14;

/**
 *
 * @author akatkar
 */
public class ExamSample {

    public static void printArray(int[][] a) {

        for ( int[] i : a ) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println("");
        }
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int[][] a = {{0,1,2},{3,4}};
        printArray(a);
                
    }
}
