/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson06;

/**
 *
 * @author akatkar
 */
public class Example {
  public static final double PI=3.14;
  
  private int private_i;
  protected int protected_i;
  public int public_i;
  int default_i;
  
    int special;
    static int count=0;
    
    public Example(){
        count++;
    }
    
    public static void main(String[] args){
        for(int i=0;i<20;i++){
            Example ex = new Example();
        }
        System.out.println("Nesne sayısı:"+Example.count);
    
        Example ex = new Example();
        ex.default_i = 1;
        ex.private_i = 2;
        ex.protected_i = 3;
        ex.public_i = 4;
        
    }
}
