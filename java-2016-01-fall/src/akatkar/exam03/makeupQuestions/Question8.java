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
public class Question8 {    
    private void numbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1 + " ");
            }
             System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Question8().numbers(9);
    }
}
