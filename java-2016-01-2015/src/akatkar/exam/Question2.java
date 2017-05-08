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
public class Question2 { 
    public static void main(String[] args) {
        System.out.println("Java'yı Seviyorum");
        new Question2().multiplicationTable();
        new Question2().countDown(10);
    }
    
    void multiplicationTable(){
        for(int i=1;i<11;i++){
            for(int j=1;j<11;j++){
                System.out.println(i + "x" + j + " = " + i*j);
            }
            System.out.println("");
        }
    }
    
    void countDown(int x){
        for(int i=x; i>0;i--){
            if(i%2 == 0){
                System.out.println(i);
            }
        }        
    }
}

