/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

/**
 *
 * @author DEE
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student StudentInfo = new Student();
        StudentInfo.setName("Dheyazen Alseelwe");
        StudentInfo.setAddress("225 kingston Ave");
        StudentInfo.setAge(22);
        StudentInfo.setPhoneNumber("718-398-7709");

        System.out.println("Name: " + StudentInfo.getName());
        System.out.println("Address: " + StudentInfo.getAddress());
        System.out.println("Age: " + StudentInfo.getAge());
        System.out.println("Phone Number: " + StudentInfo.getPhoneNumber());
    }

}
