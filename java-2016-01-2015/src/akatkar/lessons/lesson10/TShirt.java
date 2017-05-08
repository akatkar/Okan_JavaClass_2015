/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson10;

/**
 *
 * @author akatkar
 */
public class TShirt {
    private TShirtSize size;
    
    public TShirt(TShirtSize size){
        this.size = size;
    }

    public TShirtSize getSize() {
        return size;
    }
}
