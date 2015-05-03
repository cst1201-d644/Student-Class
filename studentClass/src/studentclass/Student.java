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
public class Student {

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
