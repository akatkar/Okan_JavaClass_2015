/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework08;

import java.io.Serializable;

/**
 *
 * @author akatkar
 */
public class CountryInfo implements Serializable {

    public final static int X = 10;
    
    private String name;
    private long population;

    public CountryInfo(String name, long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        String result = "Name : " + name;
        result += "\nPopulation : " + population + "\n";
        return result;
    }
    
    public static void main(String[] args) {
        
        for(int i=1;i<=X;i++){
            for(int j=1;j<=X;j++){
                System.out.println(i + " x " + j + " = "+i*j);
            }
            System.out.println("");
        }
        
    }
}
