/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework03;

import javax.swing.JOptionPane;

/**
 *
 * @author akatkar
 */
public class NumberToText_Solution_03 {
    // Dizilerin adını ingilizceye çevirdik ve büyük yaptık
    // final static olduğu için büyük harflerle yazılmalı
    final static String[] ONES = {"Sıfır", "Bir", "İki", "Üç", "Dört", "Beş",
        "Altı", "Yedi", "Sekiz","Dokuz"};
    final static String[] TENS = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", 
        "Altmış", "Yetmiş","Seksen", "Doksan"};
    final static String[] HUNDREDS = {"", "Yüz", "İkiyüz", "Üçyüz", "Dörtyüz", 
        "Beşyüz", "Altıyüz", "Yediyüz", "Sekizyüz", "Dokuzyüz"};
    final static String[] THOUSANDS = {"", "Bin", "İkibin", "Üçbin", "Dörtbin",
        "Beşbin", "Altıbin","Yedibin", "Sekizbin", "Dokuzbin"};

    public static void main(String[] args) {
        numberToText();
    }

    
    //Metodun adını ve değişkenleri ingilizceye çevirdik
    static void numberToText() {
        int number, ones, tens, hundreds, thousands;
        number = Integer.valueOf(JOptionPane.showInputDialog("Lütfen Bir Sayı Girin"));

        ones = (number / 1) % 10; 
        tens  = (number / 10) % 10;
        hundreds = (number / 100) % 10;
        thousands = (number / 1000) % 10;

        System.out.println(THOUSANDS[thousands] + "  " + HUNDREDS[hundreds] + " " +
                           TENS[tens] + " " + (ones > 0 ? ONES[ones] : ""));
    }
    
}
