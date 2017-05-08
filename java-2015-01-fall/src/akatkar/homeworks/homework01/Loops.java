/**
 * @Tarih 07.10.2015
 * @Okul Okan Üniversitesi Bilgisayar Programlama
 * @Ödev 1
*/
package akatkar.homeworks.homework01;

/**
 *
 * @author alikatkar
 */
public class Loops {
     public static void main(String[] args) {

         for (int i = 0; i < 10; i++)
            System.out.println(i);
         
         // Buraya yukarıdaki kodun eşleniğini while döngüsü olarak yazın
         int i=0;
         while(i<10){
             System.out.println(i);
             i++;
         }
     }
}
