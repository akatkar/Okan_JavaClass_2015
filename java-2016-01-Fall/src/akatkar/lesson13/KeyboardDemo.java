/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson13;

import java.util.Random;

/**
 *
 * @author akatkar
 */
public class KeyboardDemo {
    public static void main(String[] args) {
        
        Random random = new Random();
        int number = random.nextInt(100);
        
        System.out.println("Bir den 100'e kadar bir sayı tuttum.");
        System.out.println("Tahmin edebilir misin?");
        int guess;
        while(true){
            System.out.println(">");
            guess = Keyboard.getInt();
            if(guess == number){
                System.out.println("Tebrikler bildiniz");
                break;
            }
            else if(guess > number){
                System.out.println("Çok attın ya");
            }else{
                System.out.println("kısa kaldı");
            }
        }    
        
        System.out.print("Ekrana bir sayı gir:");
    }
}
