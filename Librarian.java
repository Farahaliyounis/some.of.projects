package oop_project;

public class Librarian extends Employee {

    public Librarian() {

    }

    public Librarian(int years, String Name, int age, int phoneNumber, String Address) {
        super(years, Name, age, phoneNumber, Address);
    }

    public int getYears() {
        return years;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public int getHours() {
        return 60;           // works 60 hours / week
    }
}
