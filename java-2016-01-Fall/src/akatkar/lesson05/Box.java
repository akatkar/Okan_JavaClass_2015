/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson05;

/**
 *
 * @author akatkar
 */
public class Box {
    int height, width;

    public Box(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    public Box(int height){
        this(height,height);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.height;
        hash = 97 * hash + this.width;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Box other = (Box) obj;
        if (this.height != other.height) {
            return false;
        }
        return this.width == other.width;
    }
    
    
    
    public static void main(String[] args) {
        
        Box box = new Box(8);
        box.height = 10;
        
        Box mybox = new Box(8,9);
        Box yourbox = mybox;
        Box theirbox = new Box(8,9);
        
        if(mybox == yourbox){
            System.out.println("ikisi de aynı nesne");
        }
        else {
            System.out.println("farklı nesneler");
        }
        
        if(mybox == theirbox){
            System.out.println("ikisi de aynı nesne");
        }
        else {
            System.out.println("farklı nesneler");
        }
        
        if(mybox.equals(theirbox)){
            System.out.println("ikisi de aynı boyutlarda kutu");
        }
    }
    
    
    
}
