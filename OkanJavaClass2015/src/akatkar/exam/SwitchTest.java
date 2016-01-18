/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.exam;

/**
 *
 * @author akatkar
 */
public class SwitchTest {

    public static void main(String[] args) {
        System.out.println("value =" + switchIt(3));
    }

    public static int switchIt(int x) {
        switch (x) {
            case 1: x++;
            case 2: x++;
            case 3: x++;
            case 4: x++;
            default:x++;
        }
        return x;
    }

}
