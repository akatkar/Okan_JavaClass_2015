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
public class NumberToText_Solution_01 {
 
// Link: http://www.muhendislikegitimi.com/item/611-java-uygulama-sayiyi-yaziya-cevirme.html
// Linkteki Original Çözüm bu
// Bu çözümü yavaş yavaş geliştireceğiz
    
// public class SayiyiYaziya {  
     
    public static void main(String[] args) 
    {
        SayiyiYaziyaCevir();
    }
     
    static void SayiyiYaziyaCevir()
    {
        int sayi, birler, onlar, yuzler, binler;
        sayi = Integer.valueOf(JOptionPane.showInputDialog("Lütfen Bir Sayı Girin"));
         
        birler = sayi % 10;
        onlar  = (sayi /   10) % 10;
        yuzler = (sayi /  100) % 10;
        binler = (sayi / 1000) % 10;
         
        String[] birlik = { "Sıfır", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", 
                            "Dokuz" }; 
        String[] onluk  = { "", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", 
                            "Seksen", "Doksan" }; 
        String[] yuzluk = { "", "Yüz", "İkiyüz", "Üçyüz", "Dörtyüz", "Beşyüz", "Altıyüz", 
                            "Yediyüz", "Sekizyüz", "Dokuzyüz" }; 
        String[] binlik = { "", "Bin", "İkibin", "Üçbin", "Dörtbin", "Beşbin", "Altıbin", 
                            "Yedibin", "Sekizbin", "Dokuzbin" };
         
        System.out.println(binlik[binler] + "  " + yuzluk[yuzler] + " " + onluk[onlar] + " " + 
                birlik[birler]);        
    }
}    

