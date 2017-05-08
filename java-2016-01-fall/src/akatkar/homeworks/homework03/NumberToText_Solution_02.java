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
public class NumberToText_Solution_02 {

    // Dizileri metodun dışına çıkardık
    // Bu şekilde herhangi bir metoddan çağırılabilir.
    // final yaparak değişmemesini ve 
    // static yaparak program boyunca sadece tek bir kopyalarının olmasını sağladık
    final static String[] birlik = {"Sıfır", "Bir", "İki", "Üç", "Dört", "Beş",
        "Altı", "Yedi", "Sekiz","Dokuz"};
    final static String[] onluk = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", 
        "Altmış", "Yetmiş","Seksen", "Doksan"};
    final static String[] yuzluk = {"", "Yüz", "İkiyüz", "Üçyüz", "Dörtyüz", 
        "Beşyüz", "Altıyüz", "Yediyüz", "Sekizyüz", "Dokuzyüz"};
    final static String[] binlik = {"", "Bin", "İkibin", "Üçbin", "Dörtbin",
        "Beşbin", "Altıbin","Yedibin", "Sekizbin", "Dokuzbin"};

    public static void main(String[] args) {
        SayiyiYaziyaCevir();
    }

    static void SayiyiYaziyaCevir() {
        int sayi, birler, onlar, yuzler, binler;
        sayi = Integer.valueOf(JOptionPane.showInputDialog("Lütfen Bir Sayı Girin"));

        // Birler için sayıyı bire böldük. Bu şekilde değer değişmedi ama
        // döngüde kullanabileceğimiz bir kural elde ettik. 
        birler = (sayi / 1) % 10; 
        onlar  = (sayi / 10) % 10;
        yuzler = (sayi / 100) % 10;
        binler = (sayi / 1000) % 10;

        // birler için birler basamağı sıfırdan büyükse yazmasını sağlayacak
        // üçlü operatör ekledik. 
        System.out.println(binlik[binler] + "  " + yuzluk[yuzler] + " " + onluk[onlar] + " "
                + (birler > 0 ? birlik[birler] : ""));
    }

}
