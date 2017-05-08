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
public class Question7 {

    public int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        
        boolean b = false;        byte byt = 2;
        short sh = 3;     char ch = 'A';
        int i = 5;        long lo = 25676;
        float f = 2.45f;        double d = 2.1;
        
        sh = (short) i;
    }
}
