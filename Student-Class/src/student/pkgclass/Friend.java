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
public class Friend {

    private String name, address, phoneNum;
    private int age;

    /**
     *
     * @ return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of friend
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address of the name
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNum
     */
    public String setPhoneNum() {
        return phoneNum;
    }

    /**
     *
     * @param phoneNum of the friend
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;

    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

}
