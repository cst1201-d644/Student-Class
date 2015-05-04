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
public class getInformation {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private String address;
     public String getAddress(){
        return address;
    }
      public void setAddress(String address){
        this.address = address;
    }
    private int age;
      public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }             
    }
    
    private String phoneNum;
      public String getPhoneNum(){
        return phoneNum;
    }
    
    public void setPhoneNumber(String phoneNum){
        this.phoneNum = phoneNum;
    }
}

