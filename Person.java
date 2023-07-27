
package oop_project;

public class Person {
    protected String Name;
    protected int age;
    protected int phoneNumber;
    protected String Address;

    public Person(String Name, int age, int phoneNumber, String Address) {
        this.Name = Name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
    }

    public Person() {
        
    }
    
    

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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

    @Override
    public String toString() {
        return "Person:" + "Name= " + Name + ", age= " + age + ", phoneNumber= " + phoneNumber + ", Address= " + Address;
    }
    
    
    
}
