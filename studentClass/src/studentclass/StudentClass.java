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
    static class Student {

    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String location) {
        address = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int years) {
        age = years;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String PhoneNum) {
        phoneNumber = PhoneNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
    public static void main(String[] args) {
        Student StudentInfo = new Student();
        StudentInfo.setName("Dheyazen Alseelwe");
        StudentInfo.setAddress("225 kingston Ave");
        StudentInfo.setAge(22);
        StudentInfo.setPhoneNumber("718-398-7709");
        System.out.println("My information");
        System.out.println("Name: " + StudentInfo.getName());
        System.out.println("Address: " + StudentInfo.getAddress());
        System.out.println("Age: " + StudentInfo.getAge());
        System.out.println("Phone Number: " + StudentInfo.getPhoneNumber());
        
        Student Friend1 = new Student();
        Friend1.setName("Rasheed Abisse");
        Friend1.setAddress("2839 Valentine Ave");
        Friend1.setAge(20);
        Friend1.setPhoneNumber("718-213-3965");
        
        System.out.println();
        System.out.println("First friend information.");
        System.out.println("Name: "+Friend1.getName());
        System.out.println("Address: "+Friend1.getAddress());
        System.out.println("Age: "+Friend1.getAge());
        System.out.println("Phone Number: "+Friend1.getPhoneNumber());
        
        Student Friend2 = new Student();
        Friend2.setName("Kobe Bryant");
        Friend2.setAddress("145 main st");
        Friend2.setAge(34);
        Friend2.setPhoneNumber("212-900-4509");
        
        System.out.println();
        System.out.println("Second friend's information.");
        System.out.println("Name: "+Friend2.getName());
        System.out.println("Address: "+Friend2.getAddress());
        System.out.println("Age: "+Friend2.getAge());
        System.out.println("Phone Number: "+Friend2.getPhoneNumber());
        
        
    }

}
