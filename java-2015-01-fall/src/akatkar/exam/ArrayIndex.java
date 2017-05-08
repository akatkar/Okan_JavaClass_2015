/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.exam;

/**
 *
 * @author akatkar
 */
public class ArrayIndex {

 	private int index = 2;
 
    	public void go() {
    		int [][] dd = {{9,8,7}, {6,5,4}, {3,2,1,0}};
    		System.out.println(dd[index][index]);
    	}
    
    	public static void main(String[] args) {  
        	new ArrayIndex().go();
    	}
 }

