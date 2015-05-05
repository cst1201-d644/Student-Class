/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST1201;

/**
 *
 * @author Francisco Latacela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //here is holding myInformation
        getInformation Info1 = new getInformation();
        Info1.setName("Francisco Latacela");
        Info1.setAddress("34-69 159TH STREET.");
        Info1.setAge(23);
        Info1.setPhoneNumber("(347)123 4567");

        //Here is holding my Friend Information
        getInformation Info2 = new getInformation();
        Info2.setName("Andres Mendieta");
        Info2.setAddress("44-16 150TH STREET.");
        Info2.setAge(21);
        Info2.setPhoneNumber("(646)987 6543");

        //Here is holding my family member  
        getInformation Info3 = new getInformation();
        Info3.setName("Edisson Avila");
        Info3.setAddress("12-11 90TH STREET.");
        Info3.setAge(23);
        Info3.setPhoneNumber("(917)321 8521");

        //Display my information
        System.out.println("Name: " + Info1.getName());
        System.out.println("Address: " + Info1.getAddress());
        System.out.println("Age: " + Info1.getAge());
        System.out.print("Phone Number: " + Info1.getPhoneNum());
        System.out.println();
        System.out.println();

        //Display my friend information
        System.out.println("Name: " + Info2.getName());
        System.out.println("Address: " + Info2.getAddress());
        System.out.println("Age: " + Info2.getAge());
        System.out.print("Phone Number: " + Info2.getPhoneNum());
        System.out.println();
        System.out.println();

        //Display my family member information
        System.out.println("Name: " + Info3.getName());
        System.out.println("Address: " + Info3.getAddress());
        System.out.println("Age: " + Info3.getAge());
        System.out.print("Phone Number: " + Info3.getPhoneNum());
        System.out.println();
    }

}
