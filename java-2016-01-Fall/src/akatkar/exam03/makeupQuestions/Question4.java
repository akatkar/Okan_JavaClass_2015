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
public class Question4 {

    public int getX(int n) {
        for (int i = n - 1;; i--) {
            int j;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    break;
                }
            }
            if (i == j) {
                return i;
            }
        }
    }
    
    public static void main(String[] args) {
        Question4 q4 = new Question4();
        System.out.println(q4.getX(15));
    }

}
