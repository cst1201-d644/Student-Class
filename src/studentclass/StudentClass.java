package studentclass;

import static java.awt.Color.blue;

/**
 *
 * @author Sameen Qaiser
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("India Alex");
        student1.setAddress("94 Grey St.");
        student1.setAge(25);
        student1.setPhoneNumber("(646)354-6254");

        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Phone Number: " + student1.getPhoneNumber());
        System.out.println();

        student2.setName("Annabell Vegas");
        student2.setAddress("456 Blue St.");
        student2.setAge(29);
        student2.setPhoneNumber("(718)123-4567");

        System.out.println("Name: " + student2.getName());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Phone Number: " + student2.getPhoneNumber());
        System.out.println();

        student3.setName("Henry Law");
        student3.setAddress("390 chruch St.");
        student3.setAge(28);
        student3.setPhoneNumber("(347)645-4321");

        System.out.println("Name: " + student3.getName());
        System.out.println("Address: " + student3.getAddress());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Phone Number: " + student3.getPhoneNumber());
        System.out.println();

    }

}
