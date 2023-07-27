package oop_project;

public class Secretary extends Employee {

    public Secretary() {
    }

    public Secretary(int years, String Name, int age, int phoneNumber, String Address) {
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

    public String getAddress() {
        return Address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }

    @Override
    public String toString() {
        return "Secretary Name :" + this.Name + " >> Secretary Age : "+this.age + " >> Secretary Address : "+ this.Address ;
    }

    
    
    
}
