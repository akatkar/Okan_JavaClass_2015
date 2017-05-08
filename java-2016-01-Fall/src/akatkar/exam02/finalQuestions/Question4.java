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
public class Question4 {

    public int getX(int n) {
        for (int i = n + 1;; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    break;
                }
            }
            if (j == i) {
                return i;
            }
        }
    }
    public int getY(int n) {
        for (int i = n - 1;; i--) {
            int j;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    break;
                }
            }
            if (j == i) {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        Question4 q4 = new Question4();

        System.out.println("5->" + q4.getX(5));
        System.out.println("7->" + q4.getX(7));
        System.out.println("14->" + q4.getX(14));
        System.out.println("18->" + q4.getX(18));
        System.out.println("50->" + q4.getX(50));
        System.out.println("2015->" + q4.getX(2015));
        System.out.println("2015->" + q4.getY(2015));
    }
}
