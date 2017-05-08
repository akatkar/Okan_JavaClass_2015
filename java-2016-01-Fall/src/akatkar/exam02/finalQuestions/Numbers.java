/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.exam02.finalQuestions;

import java.util.ArrayList;

/**
 *
 * @author akatkar
 */
public class Numbers {

    public static int getX(int n) {
        for (int i = n + 1;; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0)
                    break;
            }
            if (j == i)
                return i;
        }
    }

    private static void numbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    private static void numbers2(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("5->" + getX(5));
        System.out.println("7->" + getX(7));
        System.out.println("14->" + getX(14));
        System.out.println("18->" + getX(18));
        System.out.println("50->" + getX(50));

        numbers2(10);
        

    }
}
