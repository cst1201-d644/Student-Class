/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST1201;

/**
 *
 * @author Winnie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        student1.setName("Winnie Wu");
        student1.setAddress("54 Apple St.");
        student1.setAge(25);
        student1.setPhoneNumber("(718)999-9999");
        
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Age: " +student1.getAge());
        System.out.println("Phone Number: " + student1.getPhoneNumber());
        System.out.println();
        
        student2.setName("Rosa Li");
        student2.setAddress("123 Orange St.");
        student2.setAge(29);
        student2.setPhoneNumber("(718)123-4567");
        
        System.out.println("Name: " + student2.getName());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Phone Number: " + student2.getPhoneNumber());
        System.out.println();
        
        student3.setName("Charlie Ha");
        student3.setAddress("260 Peach St.");
        student3.setAge(28);
        student3.setPhoneNumber("(718)890-1234");
        
        System.out.println("Name: " + student3.getName());
        System.out.println("Address: " + student3.getAddress());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Phone Number: " + student3.getPhoneNumber());
        System.out.println();
        
        
        
    }
    
}
