/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson11;

/**
 *
 * @author akatkar
 */
public class MainClass {
    
    public static void updateScreen(Moveable[] list){
        for(Moveable m: list){
            if(m != null){
                m.move();
            }
        }
    }
    
    public static void main(String[] args) {
        Moveable[] mList = new Moveable[10];
        
        mList[0] = new Gun();
        mList[1] = new Enemy();
        mList[2] = new Enemy();
        mList[3] = new Bird();
        updateScreen(mList);
    }
            
}
