/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework08;

import java.io.*;
import java.util.HashMap;

/**
 *
 * @author akatkar
 */
public class CitiesHomework {

    private final String[] cityArray = {
        "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya",
        "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu",
        "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır",
        "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep",
        "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "İçel", "İstanbul",
        "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli",
        "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
        "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun",
        "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli",
        "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt",
        "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır",
        "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
    };

    public void generateCitiesFile(String fileName) throws IOException {

        // File nesnesi yarat ve "file1.txt" dosyasını göster
        File file = new File(fileName);
        // Dosya yoksa yarat
        if (file.exists()) {
            //Dosya varsa sil.
            file.delete();
        }
        file.createNewFile();
        // Dosyaya yazmak için FileWriter nesnesi yarat
        FileWriter fr = new FileWriter(file);
        // Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
        PrintWriter pw = new PrintWriter(fr);

        // Döngü içinde verileri dosyaya yaz
        for (String city : cityArray) {
            pw.println(city);
        }
        pw.close();
    }

    public HashMap readCitiesFile(String fileName) {

        HashMap cityMap = new HashMap();

        try {
            // File nesnesi yarat ve fileName dosyasını göster
            File file = new File(fileName);
            // file nesnesinden veri okumak için FileReader nesnesi yarat
            FileReader fr = new FileReader(file);

            // Veriyi tampon bellek üzerinden işleyebilmek için
            // BufferReader nesnesi yarat
            BufferedReader bf = new BufferedReader(fr);

            // Geçici city ve plaka kodları için değişken tanımı
            String city;
            int plate = 1;
            // Döngü içersinde veriyi oku, cityMap'e koy, plaka noyu arttır 
            while ((city = bf.readLine()) != null) {
                cityMap.put(plate, city);
                plate++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityMap;
    }

}
