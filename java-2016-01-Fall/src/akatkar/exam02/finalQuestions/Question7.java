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
public class Question7 {

    public int getMax(int[][] a) {
        int max = 0;
        for (int[] i : a) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }

    public int getMax2(int[][] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Question7 q7 = new Question7();

        int[][] a = {{1, 2, 3, 4, 5}, {98, 2, 3, 5, 6, 7, 89, 1}};
        int i = q7.getMax(a);
        System.out.println(i);
         i = q7.getMax2(a);
        System.out.println(i);
    }
}
