/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author akatkar
 */
public class ReadCountryInfo {     // DESERIALIZING 

    public static void main(String[] args) throws IOException {

        FileInputStream fileIn = new FileInputStream("country.txt");
        ObjectInputStream inStream = new ObjectInputStream(fileIn);

        try {
            // prints the first object written
            System.out.println(inStream.readObject());
            // prints the second object written
            System.out.println(inStream.readObject());
        } catch (ClassNotFoundException e) {
        }
        inStream.close();
    }
}
