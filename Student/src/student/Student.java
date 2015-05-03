/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 * This program allow user to view student and his/her family or friend
 * information
 *
 * @author Niaz Morshed
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentInfo info = new StudentInfo();
        info.setName("Niaz Morshed");
        info.setAddress("2095 Davidson Avenue, Bronx, NY 10453");
        info.setPhoneNo("917-995-6084");
        info.setAge(26);

        System.out.println("My name is: " + info.getName());
        System.out.println("Address: " + info.getAddress());
        System.out.println("Phone No: " + info.getPhoneNo());
        System.out.println("Age : " + info.getAge() + "\n");

        FriendInfo info2 = new FriendInfo();
        info2.setName("S.R.Sujon");
        info2.setAddress("Rangpur,Bangladesh");
        info2.setPhoneNo("01723408856");
        info2.setAge(27);

        System.out.println("Friend's Name: " + info2.getName());
        System.out.println("Address: " + info2.getAddress());
        System.out.println("Phone no: " + info2.getPhoneNo());
        System.out.println("Age: " + info2.getAge() + "\n");

        FamilyInfo info3 = new FamilyInfo();
        info3.setName("Abdul Mannan");
        info3.setAddress("2095 davidson avenue, bronx, ny 10453");
        info3.setPhoneNo("347-759-7728");
        info3.setAge(55);

        System.out.println("Father's Name: " + info3.getName());
        System.out.println("Address: " + info3.getAddress());
        System.out.println("Phone no: " + info3.getPhoneNo());
        System.out.println("Age: " + info3.getAge());

    }

}
