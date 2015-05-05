/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Evan
 */
public class StudentInfo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Evan");
        s1.setAddress("111 Worth Street");
        s1.setAge(20);
        s1.setPhoneNumber("917888888");
        System.out.println("My name is " + s1.getName());
        System.out.println("My address is " + s1.getAddress());
        System.out.println("I am " + s1.getAge() + " years old.");
        System.out.println("My number is " + s1.getPhoneNumber() + ".");
        System.out.println();
        
        Student s2 = new Student();
        s2.setName("Ronald");
        s2.setAddress("600 Jay Street");
        s2.setAge(35);
        s2.setPhoneNumber("800800800");
        System.out.println("My name is " + s2.getName());
        System.out.println("My address is " + s2.getAddress());
        System.out.println("I am " + s2.getAge() + " years old.");
        System.out.println("My number is " + s2.getPhoneNumber() + ".");
        System.out.println();
        
        Student s3 = new Student();
        s3.setName("Eli");
        s3.setAddress("123 Maple Street");
        s3.setAge(25);
        s3.setPhoneNumber("756848732");
        System.out.println("My name is " + s3.getName());
        System.out.println("My address is " + s3.getAddress());
        System.out.println("I am " + s3.getAge() + " years old.");
        System.out.println("My number is " + s3.getPhoneNumber() + ".");
        System.out.println();     
    }
}
