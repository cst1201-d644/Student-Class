/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

/**
 *
 * @author Kenny Tsang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("Kenny Tsang");
        student1.setAddress("123 Main St");
        student1.setAge(25);
        student1.setPhoneNumber("(718)999-9999");
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Phone Number: " + student1.getPhoneNumber());
        System.out.println();
        student2.setName("Richard Chen");
        student2.setAddress("123 Canal St.");
        student2.setAge(29);
        student2.setPhoneNumber("(718)000-0000");
        System.out.println("Name: " + student2.getName());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Phone Number: " + student2.getPhoneNumber());
        System.out.println();
        student3.setName("Emily Kuang");
        student3.setAddress("300 Jay St.");
        student3.setAge(28);
        student3.setPhoneNumber("(718)555-5555");
        System.out.println("Name: " + student3.getName());
        System.out.println("Address: " + student3.getAddress());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Phone Number: " + student3.getPhoneNumber());
        System.out.println();
    }
}
