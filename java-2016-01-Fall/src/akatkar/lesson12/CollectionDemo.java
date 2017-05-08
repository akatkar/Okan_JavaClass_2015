/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akatkar
 */
public class CollectionDemo {

    public static void printList(List myList){
        for(Object s:myList){
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        String[] arrayString = new String[2];

        ArrayList arrayList;
        arrayList = new ArrayList();

        arrayString[0] = "bir";
        arrayString[1] = "iki";
        //arrayString[2] = "üç";

        arrayList.add("Bir");
        arrayList.add("İki");
        arrayList.add("Üç");
        arrayList.add("Dört");
        arrayList.add("Beş");
        arrayList.add("Altı");
        arrayList.add("Yedi");
        arrayList.add(4);

//        for (Object s : arrayList) {
//            System.out.println(s);
//        }
        printList(arrayList);
        
        System.out.println("Beşinci eleman:" + arrayList.get(4));
        System.out.println("size:" + arrayList.size());

        arrayList.remove(2);
        System.out.println("size:" + arrayList.size());

        printList(arrayList);
        
        arrayList.add(2, "Üç");
        System.out.println("inserted size:" + arrayList.size());
        printList(arrayList);
        arrayList.remove(6);

        arrayList.add(6, "deneme");
        printList(arrayList);
    }

}
