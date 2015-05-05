
package personalinfo;

import java.util.Scanner;

/**
 *
 * @author laboni
 */
public class PersonalInfo {
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String Name;
        String Address;
        int Age;
        Long PhoneNumber;
        {
// Get the user's name.
            System.out.print("What is your name? ");
            Name = keyboard.nextLine();
// Get the user's address.
            System.out.print("What is your full address? ");
            Address = keyboard.nextLine();
// Get the user's age.
            System.out.print("What is your age? ");
            Age = keyboard.nextInt();
// Get the user's phone number.
            System.out.print("Type your 10-digit phone number: ");
            PhoneNumber = keyboard.nextLong();
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("Your name is " + Name);
            System.out.println("Your address is " + Address);
            System.out.println("Your age is " + Age);
            System.out.println("Your phone number is " + PhoneNumber);
        }
    }
}
