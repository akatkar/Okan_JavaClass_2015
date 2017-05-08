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
public class NumberToText_Solution_04 {

    final static String[] ONES = {"Sıfır", "Bir", "İki", "Üç", "Dört", "Beş",
        "Altı", "Yedi", "Sekiz","Dokuz"};
    final static String[] TENS = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", 
        "Altmış", "Yetmiş","Seksen", "Doksan"};
    final static String[] HUNDREDS = {"", "Yüz", "İkiyüz", "Üçyüz", "Dörtyüz", 
        "Beşyüz", "Altıyüz", "Yediyüz", "Sekizyüz", "Dokuzyüz"};
    final static String[] THOUSANDS = {"", "Bin", "İkibin", "Üçbin", "Dörtbin",
        "Beşbin", "Altıbin","Yedibin", "Sekizbin", "Dokuzbin"};

    // main metodunda numberToText de yapılanlara göre değişiklikler yapıldı 
    public static void main(String[] args) {
        
        // Kullanıcıdan sayı girmesini istiyoruz
        int number = Integer.valueOf(JOptionPane.showInputDialog("Lütfen Bir Sayı Girin"));
        
        // Girilen sayıyı numberTotext metoduna parametre olarak gönderiyoruz
        // Metod bize yazı halini veriyor
        String text = numberToText(number);
        
        // Sayıyı ve text halini ekrana basıyoruz.
        System.out.println(number + ":" + text);
    }

    
    // Metodun sayıyı parametre olarak almasını ve sonucu
    // text olarak yani String olarak döndürmesini sağladık
    // Bu şekilde görevi sadece sayıyı yazıya çevirmek olan
    // bir fonksiyon yaptık. Sayıyı kullanıcıdan isteme işi de 
    // bu metodu çağıran main() metoduna geçti.
    static String numberToText(int number) {
        // number(sayı) parametre olarak geldiği için buradan sildik.
        int ones, tens, hundreds, thousands;
        
        ones = (number / 1) % 10; 
        tens  = (number / 10) % 10;
        hundreds = (number / 100) % 10;
        thousands = (number / 1000) % 10;
        
        // Ekrana basmak yerine yazı halini bir String değişkene atıyoruz.
        String text = THOUSANDS[thousands] + "  " + 
                      HUNDREDS[hundreds] + " " +
                      TENS[tens] + " " + 
                      (ones > 0 ? ONES[ones] : "");
        
        // Sayının yazı halini çağıran fonksiyona gönderiyoruz.
        return text;
    }    
}
