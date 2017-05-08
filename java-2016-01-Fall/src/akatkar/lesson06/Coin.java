/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson06;

import java.util.Random;

/**
 *
 * @author akatkar
 */
public class Coin {
  
    enum CoinFace{
        TAIL("YAZI"), HEAD("TURA");
        
        private final String name;
        
        private CoinFace(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
        
    }
    private CoinFace face;
    
    
    public void throwCoin(){
        Random r = new Random();
        int num = r.nextInt(2);
        face = num == 0 ? CoinFace.TAIL: CoinFace.HEAD;
    }
    
    @Override
    public String toString(){
        return face.toString();        
    }
            
}
