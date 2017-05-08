/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author akatkar
 */
public class CountryInfo implements Serializable {

    private String name;
    private long population;

    public CountryInfo(String name, long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "CountryInfo{" + "name=" + name + ", population=" + population + '}';
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileOutputStream fileOut = new FileOutputStream("country.bin");
//        ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
//
//        CountryInfo country1 = new CountryInfo("Italy", 57679800L);
//        CountryInfo country2 = new CountryInfo("Sweden", 8875100L);
//
//        outStream.writeObject(country1);
//        outStream.writeObject(country2);
//        outStream.close();
        FileInputStream fileIn = new FileInputStream("country.bin");
        try (ObjectInputStream inStream = new ObjectInputStream(fileIn)) {
            try {
                // prints the first object written
                System.out.println(inStream.readObject());
                // prints the second object written
                System.out.println(inStream.readObject());
            } catch (ClassNotFoundException e) {
            }
        }
    }

}
