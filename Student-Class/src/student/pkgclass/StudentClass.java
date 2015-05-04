/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.pkgclass;

/**
 *
 * @author JL
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        info name = new info();
        info address = new info();
        info age = new info();
        info phonenumber = new info();
        name.setName("JL");
        address.setAddress("300 Jay Street");
        age.setAge(20);
        phonenumber.setPhonenumber("9171234567");
        System.out.println("My name : " + name.getName());
        System.out.println("My address : " + address.getAddress());
        System.out.println("My age :" + age.getAge());
        System.out.println("My phonenumber : " + phonenumber.getPhonenumber());
        one();
        two();
     
    }
     public static void one(){
        info name = new info();
        info address = new info();
        info age = new info();
        info phonenumber = new info();
        name.setName("Jakcie");
        address.setAddress("299 Jay Street");
        age.setAge(21);
        phonenumber.setPhonenumber("3471234567");
        System.out.println("Her name : " + name.getName());
        System.out.println("Her address : " + address.getAddress());
        System.out.println("Her age :" + age.getAge());
        System.out.println("Her phonenumber : " + phonenumber.getPhonenumber());
     }
         public static void two(){
        info name = new info();
        info address = new info();
        info age = new info();
        info phonenumber = new info();
        name.setName("Allen");
        address.setAddress("298 Jay Street");
        age.setAge(22);
        phonenumber.setPhonenumber("3473301234");
        System.out.println("his name : " + name.getName());
        System.out.println("his address : " + address.getAddress());
        System.out.println("his age :" + age.getAge());
        System.out.println("his phonenumber : " + phonenumber.getPhonenumber());
     }

}
