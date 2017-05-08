/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akatkar
 */
public class FileWriteDemo {

    public static void fileWrite(String fileName, String[] data) {
        try {
            // File nesnesi yarat ve "file1.txt" dosyasını göster
            File file = new File(fileName);
            // Dosya yoksa yarat
            file.createNewFile();
            // Dosyaya yazmak için FileWriter nesnesi yarat
            FileWriter fr = new FileWriter(file);
            // Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
            PrintWriter pw = new PrintWriter(fr);
            
            // Döngü içinde verileri dosyaya yaz
            for (String s : data) {
                pw.println(s);
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriteDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fileRead(String fileName) {
        FileReader fr = null;
        try {
            File file = new File(fileName);
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            try {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException ex) {
                Logger.getLogger(FileWriteDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileWriteDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(FileWriteDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void keyboard(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir int değer gir:");
        int i = scanner.nextInt();
        System.out.println("girilen int değer:" + i);
        
    }

    public static void main(String[] args)  {
        String[] bookStore = {"Book1", "Book2", "Book3", "Book4"};
        String fileName = "file2.txt";
        fileWrite(fileName, bookStore);
        fileRead(fileName);
        keyboard();
    }

}
