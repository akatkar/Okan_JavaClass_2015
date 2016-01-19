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
public class Triangle {
    
     public static void main(String[] args) {
         
         // iç içe iki for döngüsü kullanarak aşağıdaki şekli ekrana basan
         // kodu yazın

         // *
         // **
         // ***
         // ****
         // *****
         for(int i=0;i<6;i++){
             for(int j=0;j<i;j++){
                 System.out.print("*");
             }
             System.out.println("");
         }                  
     }    
}
