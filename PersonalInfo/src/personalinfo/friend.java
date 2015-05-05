package personalinfo;


public class friend {
    private String name;
    private String address;
    private int age;
    private int phonenumber;

    friend(String Name, String Address, int Age, int PhoneNumber) {
        name = Name;
        address = Address;
        age = Age;
        phonenumber = PhoneNumber;
    }

    public String getName(String Name) {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int setPhoneNumber() {
        return phonenumber;
    }
}
    


