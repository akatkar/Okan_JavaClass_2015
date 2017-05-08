/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework03;

/**
 *
 * @author alikatkar
 */
public class NumberToText_Solution_05 {

    final static String[] ONES = {"", "Bir", "İki", "Üç", "Dört", "Beş",
        "Altı", "Yedi", "Sekiz", "Dokuz"};
    final static String[] TENS = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli",
        "Altmış", "Yetmiş", "Seksen", "Doksan"};
    final static String HUNDREDS = "Yüz";
//    final static String[] HUNDREDS = {"", "Yüz", "İkiyüz", "Üçyüz", "Dörtyüz",
//        "Beşyüz", "Altıyüz", "Yediyüz", "Sekizyüz", "Dokuzyüz"};
    final static String[] THOUSANDS = {"", "Bin", "Milyon", "Milyar", "Trilyon"};

    static String numberToTextAsThreeDigit(int number) {
        String text = "";
        int digitCount = 0;
        while (number > 0) {
            int digit = number % 10;

            switch (digitCount) {
                case 0:
                    text = ONES[digit] + text;
                    break;
                case 1:
                    text = TENS[digit] + text;
                    break;
                case 2:
                    text = ((digit > 1) ? ONES[digit] : "") + HUNDREDS + text;
                    break;

            }

            number /= 10;
            digitCount++;
        }

        return text;
    }

    static String numberToText(int number) {
        
        if(number == 0){
            return "Sıfır";
        }
               
        String text = "";
        int thousand = 0;
        while (number > 0) {
            int threeDigit = number % 1000;
            text = numberToTextAsThreeDigit(threeDigit) + THOUSANDS[thousand] + text;

            thousand++;
            number /= 1000;
        }

        return text;
    }

    // main metodunda numberToText de yapılanlara göre değişiklikler yapıldı 
    public static void main(String[] args) {
        
        int[] testNumbers = {
            123456,
            123001,
            12300005,
            256256256,
            100010001
        };
               
        for(int number:testNumbers){
            System.out.println(numberToText(number));
        }
        
    }

}
