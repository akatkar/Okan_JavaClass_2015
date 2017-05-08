/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson03;

/**
 *
 * @author akatkar
 */
public class Lesson3 {

    static int carpi2(int x) {
        return x << 1;
    }

    static int carpi2n(int x, int n) {
        return x << n;
    }

    static void tablo() {
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(j + " x " + i + " = " + j * i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int a = 5;
        System.out.println("a:" + a);
        a = carpi2(a);
        System.out.println("a:" + a);
        a = carpi2n(a, 4);
        System.out.println("a:" + a);

        tablo();

    }
}
