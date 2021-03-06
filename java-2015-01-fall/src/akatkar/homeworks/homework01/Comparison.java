/**
 * @Tarih 07.10.2015
 * @Okul Okan Üniversitesi Bilgisayar Programlama
 * @Ödev 1
*/
package akatkar.homeworks.homework01;

import java.util.Scanner;

/**
 *
 * @author alikatkar
 */
public class Comparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Komut satırından giriş almak için Scanner nesnesi
      Scanner input = new Scanner( System.in );

      int number1; // Karşılaştırılacak birinci sayı
      int number2; // Karşılaştırılacak ikinci sayı

      System.out.print( "Enter first integer: " ); // prompt 
      number1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user 
      
      // Buraya ekrandan girilen sayıları karşılaştırarak 
      // hangi sayının büyük hangisinin küçük, sayıların farklı 
      // olma ya da eşit olma durumlarını yazan kodu yazın
      
      // Örnek çıktı  
      //  20 != 23
      //  20 < 23
      //  20 <= 23
      
      // kodu buradan itibaren yazın
      if(number1>number2){
          System.out.println(number1 + " > " + number2);
      }else if (number1 == number2){
          System.out.println(number1 + " = " + number2);
      }else{
          System.out.println(number1 + " < " + number2);
      }
      
    }
}
