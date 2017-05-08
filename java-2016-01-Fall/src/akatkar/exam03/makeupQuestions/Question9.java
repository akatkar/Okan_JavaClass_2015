/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.exam03.makeupQuestions;

/**
 *
 * @author akatkar
 */
public class Question9 {

    int sum(int a, int b) {
        return a + b;
    }

    long sum(long a, long b) {
        return a + b;
    }
    
    int sum(short a, short b) {
        return a + b;
    }
    

    
    public static void main(String[] args) {
        long lo = 1;
        short sh = 1;
        int i = 1;
        
        Question9 q9 = new Question9();
        
        System.out.println(q9.sum(lo, lo));
        System.out.println(q9.sum(sh, sh));
        System.out.println(q9.sum(i, i));
    }
    
}
