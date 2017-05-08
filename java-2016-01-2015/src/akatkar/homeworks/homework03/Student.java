/**
 * @Tarih 21.10.2015
 * @Okul Okan Üniversitesi Bilgisayar Programlama
 * @Ödev 3 
 * 1 - Student isminde bir sınıf (class) tanımlayın 
 * 2 - Adı, Soyadı, Numarası, Okulu, Bölümü üye değişken olarak tanımlansın 
 * 3 - Student sınıfında ismi olmayan bir nesne yaratılamasın. 
 *     (Ona göre yapıcı tanımlayacaksınız) 
 * 4 - displayStudent isminde bir metodunuz olsun, öğrencinin bilgilerini ekrana
 *     yazsın 
 * 5 - main metodunu yazıp en az iki tane öğrenci nesnesi yaratın ve
 *     bilgilerini ekrana yazdırın 
 * 6 - iki Student nesnesini eşit mi diye karşılaştırın.
 */
package akatkar.homeworks.homework03;

import java.util.Objects;

/**
 *
 * @author akatkar
 */
//1 - Student isminde bir sınıf (class) tanımlayın
public class Student {

    //2 - Adı, Soyadı, Numarası, Okulu, Bölümü üye değişken olarak tanımlansın
    private String name;
    private String surname;
    private String id;
    private String school;
    private String branch;

    // 3 - Student sınıfında ismi olmayan bir nesne yaratılamasın. 
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // 4 - displayStudent isminde bir metodunuz olsun, öğrencinin bilgilerini 
    //     ekrana yazsın
    public void displayStudent(){
        System.out.println("name=" + name + ", surname=" + surname + 
                ", id=" + id + ", school=" + school + ", branch=" + branch);        
    }

    //5 - main metodunu yazıp en az iki tane öğrenci nesnesi yaratın ve
    //    bilgilerini ekrana yazdırın 
    public static void main(String[] args) {
        Student s1 = new Student("Al","Pacino");
        Student s2 = new Student("Brad","Pitt");
        
        s1.displayStudent();
        s2.displayStudent();
        
        // 6.iki Student nesnesini eşit mi diye karşılaştırın. (uygulaması)
        if(s1.equals(s2)){
            System.out.println("Aynı öğrenciler");
        }else{
            System.out.println("Farklı öğrenciler");
        }
    }

    //6 - iki Student nesnesini eşit mi diye karşılaştırın.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return this.surname.equals(other.surname);
    }    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }
}
