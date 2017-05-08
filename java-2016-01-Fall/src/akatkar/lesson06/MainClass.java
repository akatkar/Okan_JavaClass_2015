/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson06;

/**
 *
 * @author akatkar
 */
public class MainClass {
    TShirtSize size;

    public MainClass(TShirtSize size) {
        this.size = size;
    }
    
   
    public static void main(String[] args) {
//        MainClass mainClass = new MainClass(TShirtSize.L);
//        System.out.println(mainClass.size.getRegularSize());
//        
//        int[] ia = new int[100];
//        
//        for(int i=1;i<ia.length+1;i++){
//            ia[i-1] = i * i;
//        }
////        
////        for(int i=0;i<ia.length;i++){
////            System.out.println(ia[i]);
////        }
//        
//        for(int i:ia){
//            System.out.println(i);
//        }
        
        Coin myCoin = new Coin();
        for(int i=0;i<5;i++){
        myCoin.throwCoin();
        System.out.println(myCoin);
        }
        
        
    }
}
