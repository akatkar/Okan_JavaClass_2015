/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson01;

/**
 *
 * @author akatkar
 */
public class HelloWorld {

    public static void sleepMode() {
        System.out.println("SleepMode");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("0'a bölme hatası");
        }
        return ((float) a / (float) b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Sleep Mode
        sleepMode();
        int sum = add(5, 7);
        System.out.println("Toplam = " + sum);
        System.out.println("Çarpım = " + multiply(5, 6));
        System.out.println("Bölüm = " + divide(5, 2));
    }

}
