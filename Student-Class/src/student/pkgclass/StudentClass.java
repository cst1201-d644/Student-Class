/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student.pkgclass;

/**
 *
 * @author Ziying Guo
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Info friend = new Info();
       friend.setName("XiaoMi Lei");
       friend.setAddress("8613 18th Ave");
       friend.setAge(22);
       friend.setPhoneNumber("718-256-2333");
       System.out.println("Name: "+friend.getName()+"(friend)");
       System.out.println("Address: "+friend.getAddress());
       System.out.println("Age: "+friend.getAge());
       System.out.println("Phone Number: "+friend.getPhoneNumber()); 
       
       System.out.println();
       
       Info family = new Info();
       family.setName("Dami Laji");
       family.setAddress("Guangzhou Road, Huanggang Ave");
       family.setAge(33);
       family.setPhoneNumber("07505789188");
       System.out.println("Name: "+family.getName()+"(family)");
       System.out.println("Address: "+family.getAddress());
       System.out.println("Age: "+family.getAge());
       System.out.println("Phone Number: "+family.getPhoneNumber());  
       
        System.out.println();
        
       Info me = new Info();
       me.setName("Ziyi Gg");
       me.setAddress("1926 73rd St");
       me.setAge(21);
       me.setPhoneNumber("347-744-4444");
       System.out.println("Name: "+me.getName()+ "(me)");
       System.out.println("Address: "+me.getAddress());
       System.out.println("Age: "+me.getAge());
       System.out.println("Phone Number: "+me.getPhoneNumber()); 
 
    }
    
}
