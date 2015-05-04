package student.pkgclass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ziying Guo
 */
 public class Info {
 private String name;
 private String address;
 private int age;
 private String phoneNumber;

 public void setName(String n){
 name = n;
 }
 public String getName(){
 return name;
 }

 public void setAddress(String where){
 address = where;
 }
 public String getAddress(){
 return address;
 }

 public void setAge(int years){
 age = years;
 }
 public int getAge(){
 return age;
 }

 public void setPhoneNumber(String PhoneNum){
 phoneNumber = PhoneNum;
 }
 public String getPhoneNumber(){
 return phoneNumber;
 }

}