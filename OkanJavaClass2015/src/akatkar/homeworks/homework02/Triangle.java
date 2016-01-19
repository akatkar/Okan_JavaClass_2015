/**
 * @Tarih 14.10.2015
 * @Okul Okan Üniversitesi Bilgisayar Programlama
 * @Ödev 2
 * 1 - Geçen haftaki ödevi GitHub'a koyun. Ödevi yapılmış olarak tabi.. 
 * 2 - Sola dayalı üçgeni yukarıdan aşağıya bastırın
       metot adı: reverseLeftAlignedTriangle
 * 3 - Sağa dayalı üçgeni yukarıdan aşağıya bastırın
       metot adı: reverseRightAlignedTriangle
 * 4 - Düz üçgeni ters bastırın ;  metotAdı: reverseTriangle
 * 5 - Baklava dilimi bastırın ; Metot adı; diamond  
*/

package akatkar.homeworks.homework02;

/**
 *
 * @author akatkar
 */
public class Triangle {

    // *****      
    // ****
    // ***
    // **
    // *
    public static void reverseLeftAlignedTriangle(int len){
        for(int i=len;i>0;i--){ //Düz sola dayalıdan sadece bu satır farklı
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }          
    }
    
    // *****      
    //  ****
    //   ***
    //    **
    //     *
    public static void reverseRightAlignedTriangle(int len){
        for(int i=len;i>0;i--){
            // Sağa yaslamak için her satırda artan boşluk basıyoruz
            // 0 dan len-i'ye kadar. İlk satır için 0, sonra 1,2.. boşluk
            for(int j=0;j<len-i;j++){
                System.out.print(" ");
            }
            //Boşluklardan sonra * satır sayısı ile bir azalan boşluk
            //i her döngüde 1 azaldığı için her satırda bir eksik basıyoruz
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(""); // burada alt satıra geçiyoruz
         }                  
    }
    
    //  *****
    //   ***
    //    *
    public static void reverseTriangle(int len){
        for(int i=len;i>0;i--){
            // Sağa dayalı üçgende olduğu gibi aynı boşlukları bırakıyoruz
            for(int j=0;j<len-i;j++){
                System.out.print(" ");
            }
            // Burada * sayısı 2 şer azalacak. Her satırda tek sayıda * var.
            // O zaman (2*n-1)'e kadar basarsak her satır için bir önceki
            // tek sayıya kadar basmış oluruz
            for(int j=0; j<(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }                  
    }

    //    *
    //   ***
    //  *****
    public static void triangle(int len){
        for(int i=0;i<len;i++){ //reverseTriangle'den sadece bu satır farklı
            // Sağa dayalı üçgende olduğu gibi aynı boşlukları bırakıyoruz
            for(int j=0;j<len-i;j++){
                System.out.print(" ");
            }
            // Burada * sayısı 2 şer azalacak. Her satırda tek sayıda * var.
            // O zaman (2*n-1)'e kadar basarsak her satır için bir önceki
            // tek sayıya kadar basmış oluruz
            for(int j=0; j<(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }                  
    }

    //    *
    //   ***
    //  *****
    //   ***
    //    *
    public static void diamond(int len){
        // Önce düz sonra ters üçgeni çağırırsak baklava deseni çıkar.
        // Bu iki fonksiyonun içini buraya yazarak ta aynı şeyi yapmış oluruz
        triangle(len);
        reverseTriangle(len);
    }
    
    public static void main(String[] args) {
        System.out.println("SOLA DAYALI TERS ÜÇGEN");
        reverseLeftAlignedTriangle(5);
    
        System.out.println("SAĞA DAYALI TERS ÜÇGEN");
        reverseRightAlignedTriangle(5);
    
        System.out.println("DÜZ ÜÇGEN");
        triangle(5);

        System.out.println("TERS ÜÇGEN");
        reverseTriangle(5);
        
        System.out.println("BAKLAVA DİLİMİ");
        diamond(5);
    }
}
