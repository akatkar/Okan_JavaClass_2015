/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author akatkar
 */
public class WriteCountryInfo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("country.txt");
        ObjectOutputStream outStream = new ObjectOutputStream(fileOut);

        CountryInfo country1 = new CountryInfo("Italy", 57679800L);
        CountryInfo country2 = new CountryInfo("Sweden", 8875100L);

        outStream.writeObject(country1);
        outStream.writeObject(country2);
        outStream.close();
    }
}
