/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson04;

import java.util.Objects;

/**
 *
 * @author akatkar
 */
public class GradeBook {
    
    String myName;
    
    public GradeBook(){
        this("anonim");
//        myName = "anonim";
    }
    
    public GradeBook(String name){
        myName = name;
    }
    
    public void displayMessage(){
        System.out.println(myName + " nesneden Hello");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.myName);
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
        final GradeBook other = (GradeBook) obj;
        if (!Objects.equals(this.myName, other.myName)) {
            return false;
        }
        return true;
    }
    
    
    
    public static void main(String[] args){
        GradeBook my,yours;
        
        my = new GradeBook();
//        my.myName= "Benim";        
        my.displayMessage();
        
        
 //       yours = new GradeBook("Sizin");
        yours = new GradeBook();
//        yours.myName="Sizin";
        yours.displayMessage();
        
//        yours = my;
        
        if(my.equals(yours)){
            System.out.println("Bunlar aynı");
        }else{
            System.out.println("aynı değil");
        }
        
    }
}
