/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework08;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author akatkar
 */
public class MainClass {
    public static void main(String[] args) {
        CitiesHomework cityHomework = new CitiesHomework();
        
        // Şehirleri dosyaya yaz
        try {
            cityHomework.generateCitiesFile("Cities.txt");
        } catch (IOException ex) {
            System.err.println("Dosya yaratılamadı"+ex.getMessage());
        }

        // Dosyadan şehirleri oku
        HashMap cityMap = cityHomework.readCitiesFile("Cities.txt");
        
        //Klavyeden girdi almak için Scanner nesnesi yarat
        Scanner input = new Scanner( System.in );
  
        // Ekrana kullanıcının ne yapacağını yazdır
        System.out.print( "Bir plaka kodu girin: " );
        // Kullanıcının girdiği plaka kodunu oku
        int plate = input.nextInt();
        
        // Girilen plaka kodunu map'de ara
        String yourCity = (String)cityMap.get(plate);
        if(yourCity != null){
            System.out.println(plate + " plaka kodlu şehir " + yourCity);
        }else{
            System.out.println(plate + " plaka kodlu bir şehir yok !!!");
        }
    }
}
