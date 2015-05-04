/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.pkgclass;

/**
 *
 * @author class
 */
public class ClassStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student add = new Student();
        add.setName("Devya Gurung");
        add.setAddress("600 Elmhurst ave, Queens");
        add.setPhoneNum("6465843423");
        add.setAge(25);

        System.out.println("My name is " + add.getName());
        System.out.println("My address is " + add.getAddress());
        System.out.println("My phone num is " + add.setPhoneNum());
        System.out.println("My age is " + add.getAge()+"\n");

        Friend add2 = new Friend();
        add2.setName("Maria Gold");
        add2.setAddress("300 Jay st, Brooklyn");
        add2.setPhoneNum("6467688901");
        add2.setAge(23);

        System.out.println("My name is " + add2.getName());
        System.out.println("My address is " + add2.getAddress());
        System.out.println("My phone num is " + add2.setPhoneNum());
        System.out.println("My age is " + add2.getAge() + "\n");

        Family add3 = new Family();
        add3.setName("Maya Gurung");
        add3.setAddress("896 Jay st, Brooklyn");
        add3.setPhoneNum("3467688901");
        add3.setAge(23);

        System.out.println("My name is " + add3.getName());
        System.out.println("My address is " + add3.getAddress());
        System.out.println("My phone num is " + add3.setPhoneNum());
        System.out.println("My age is " + add3.getAge());
    }

}
