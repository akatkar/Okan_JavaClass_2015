/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson05;

import java.util.Objects;

/**
 *
 * @author akatkar
 */
public class Student {
    
    String surname;
    String name;
    String no;
    String school;
    String department;
    
    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;                
    }

    public Student(String surname, String name, String no, String school, String department) {
        this.surname = surname;
        this.name = name;
        this.no = no;
        this.school = school;
        this.department = department;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        else if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
//    public String toString(){
//        String s = name;
//        s += "-"+surname;
//        return s;
//    }
//    

    @Override
    public String toString() {
        return  "surname=" + surname + ", name=" + name + ", no=" + no +
                ", school=" + school + ", department=" + department;
    }
    
    
    public static void main(String[] args){
        
        Student ahmet, harun, ali;
        
        ali = new Student("Ahmet", "Bozok");
        
        ali.no = "1122";
        
        ahmet = new Student("Ahmet", "Bozok");
        ahmet.department = "mekatronik";
        
        harun = new Student("Harun", "Akgün");
        harun.no = "333";
        harun.department = "Bilgisyar";
        
        
        System.out.println("Öğrenci:"+ahmet);
        
        if(ahmet.equals(ali)){
            System.out.println("aynı nesne");
        }else{
            System.out.println("farklı nesne");
        }
    }
}

