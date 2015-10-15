/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson03;

/**
 *
 * @author alikatkar
 */
public class Triangle {

    // *
    // **
    // ***
    // ****
    public static void leftAllignedTriangle(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //    *
    //   **
    //  ***
    // ****
    public static void rightAllignedTriangle(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(j < len - i - 1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
    //   *
    //  ***
    // *****
    public static void triangle(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 *i +1; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }        
    }

    public static void bitwiseOperations(){
        
        int i = 5;
        // i sayısı 2 sola kaydırılarak 4 ile çarpılıyor
        // 2 üzeri 2 = 4 
        i = i << 2;
        System.out.println("i:"+i);
        // i sayısı sola 1 kaydırılarak 2 üzeri 1 yani 2 ye bölünüyor
        i = i >> 1;
        System.out.println("i:"+i);                
    }
    
    public static void main(String[] args) {

        rightAllignedTriangle(5);
        leftAllignedTriangle(10);
        triangle(10);
        bitwiseOperations();
        
        for(int i=0;i<100;i++){
            if(i%4 == 0){
                continue;
            }
            System.out.println(i);
                
        }
    }
}
