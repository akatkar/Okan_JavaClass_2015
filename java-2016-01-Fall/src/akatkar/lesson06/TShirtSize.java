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
public enum TShirtSize {
    S(38), M(40), L(42), XL(44), XXL(46);

    private int size;

    private TShirtSize(int size){
        this.size = size;
    }
    public int getRegularSize(){
        return size;
    }
}
