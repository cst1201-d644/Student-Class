/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GKundu
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("John");
        s1.setAddress("190-15 Jamaica Ave");
        s1.setAge(20);
        s1.setPhoneNumber("6462005955");
        System.out.println("My Name is " + s1.getName());
        System.out.println("My Home Address is " + s1.getAddress());
        System.out.println("I'm " + s1.getAge() + " year/years old ");
        System.out.println("My Phone number is " + s1.getPhoneNumber());

        System.out.println("--------------------------------------------");

        Student s2 = new Student();
        s2.setName("George");
        s2.setAddress("200-15 Hillside Ave");
        s2.setAge(22);
        s2.setPhoneNumber("7185825955");
        System.out.println("My Name is " + s2.getName());
        System.out.println("My Home Address is " + s2.getAddress());
        System.out.println("I'm " + s2.getAge() + " year/years old ");
        System.out.println("My Phone number is " + s2.getPhoneNumber());

        System.out.println("--------------------------------------------");

        Student s3 = new Student();
        s3.setName("Smith");
        s3.setAddress("1900 Jericho Trpk");
        s3.setAge(24);
        s3.setPhoneNumber("9172565955");
        System.out.println("My Name is " + s3.getName());
        System.out.println("My Home Address is " + s3.getAddress());
        System.out.println("I'm " + s3.getAge() + " year/years old ");
        System.out.println("My Phone number is " + s3.getPhoneNumber());

    }

}

