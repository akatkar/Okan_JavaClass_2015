/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author akatkar
 */
public class FileExample {

    public void fileWriteExample() throws IOException {
        String[] bookStore = {"Book1", "Book2", "Book3"};

        // File nesnesi yarat ve "file1.txt" dosyasını göster
        File file = new File("file1.txt");
        // Dosya yoksa yarat
        if (file.exists() == false) {
            file.createNewFile();
        }
        // Dosyaya yazmak için FileWriter nesnesi yarat
        FileWriter fr = new FileWriter(file);
        // Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
        PrintWriter pw = new PrintWriter(fr);

        // Döngü içinde verileri dosyaya yaz
        for (String s : bookStore) {
            pw.println(s);
        }
        pw.close();

    }

    public void readExample() {
        String s = "";
        try {
            // File nesnesi yarat ve "file1.txt" dosyasını göster
            File file = new File("file1.txt");
            // file nesnesinden veri okumak için FileReader nesnesi yarat
            FileReader fr = new FileReader(file);
            // Veriyi tampon bellek üzerinden işleyebilmek için
            // BufferReader nesnesi yarat
            BufferedReader bf = new BufferedReader(fr);

            // Döngü içersinde veriyi oku ve ekrana bas
            while ((s = bf.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
