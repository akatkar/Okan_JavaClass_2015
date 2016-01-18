package akatkar.homeworks.homework04;

// ÖDEV 4 – Diziler ve String

/**
 *
 * @author akatkar
 */
public class MainClass {
    
    public static void main(String[] args) {
        // 1 - int tipinde 10 elemanlı bir dizi yapın. Dizi elemanları rastgele 
        //     sabit sayılar olsun.
        int[] array = {5,8,3,2,1,8,9,45,22,4};
        
        // 2 - Dizi elemanlarını hem for döngüsü hem de for each döngüsü ile 
        //     bastırın
        for(int i=0;i<array.length;i++){
            System.out.println(i);
        }
        
        for(int i:array){
            System.out.println(i);
        }
        // 3 - 5. eleman ile 7. elemanı yer değiştirin ve tekrar bastırın
        int temp = array[5];
        array[5] = array[7];
        array[7] = temp;

        for(int i:array){
            System.out.println(i);
        }
        
        // 4 - 20 elemanlı String dizisi tanımlayın. İlk değerleri plaka  
        //     sırasına göre şehir isimleri olsun. (İsteyen 81 ilin tamamını
        //     yazabilir)
        String[] cityArray = {"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", 
            "Ankara", "Antalya","Artvin", "Aydın", "Balıkesir", "Bilecik", 
            "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", 
            "Çankırı", "Çorum", "Denizli"};
        
        // 5 - Dizide ki "B" ile başlayan şehirleri ekrana bastırın
        for(String city:cityArray){
            if(city.startsWith("B")){
                System.out.println(city);
            }
        }        
    }
}
