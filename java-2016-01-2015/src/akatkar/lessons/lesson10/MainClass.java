/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson10;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akatkar
 */
public class MainClass {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(TShirtSize.XL);
        System.out.println("Size:"+tShirt.getSize());
        
        FileExample fe = new FileExample();
//        try {
//            fe.fileWriteExample();
//        } catch (IOException ex) {
//            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        fe.readExample();
    }
}
