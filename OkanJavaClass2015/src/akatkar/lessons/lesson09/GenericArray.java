/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson09;

import java.util.List;

/**
 *
 * @author akatkar
 */
public class GenericArray<T> {
    
	// "T" tip parametresidir
	// Listede tutulacak tipi belirliyor
	private List<T> genericArray;
	private int maxNum;

        public GenericArray(){
            maxNum = 32;
            
        }
        
	public GenericArray(int maxNum, List<T> pool) {
		// Yapıcı metot
		this.maxNum = maxNum;
		this.genericArray = pool;
	}

    
    
    
    
}
