/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.exam02.finalQuestions;

/**
 *
 * @author akatkar
 */
public class Question8 {
    private void numbers(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Question8 q8 = new Question8();
        
        q8.numbers(9);
    }
}
