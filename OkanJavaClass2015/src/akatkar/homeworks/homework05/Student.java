/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework05;

/**
 *
 * @author akatkar
 */
public class Student {

    private String surname;
    private String name;
    private String no;
    private String school;
    private String department;

    public Student(String surname, String name, String no) {
        this.surname = surname;
        this.name = name;
        this.no = no;
    }

    public Student(String surname, String name, String no, String school, String department) {
        this.surname = surname;
        this.name = name;
        this.no = no;
        this.school = school;
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "surname=" + surname + ", name=" + name + ", no=" +
                no + ", school=" + school + ", department=" + department + '}';
    }
}
