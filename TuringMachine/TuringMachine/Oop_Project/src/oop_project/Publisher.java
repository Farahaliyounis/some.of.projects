package oop_project;

public class Publisher extends Person{
    // camelCase Typing;
    
    private String publishingYear;
    private String email;
    private String description;

    public Publisher(String publishingYear, String email, String description, String Name, int age, int phoneNumber, String Address) {
        super(Name, age, phoneNumber, Address);
        this.publishingYear = publishingYear;
        this.email = email;
        this.description = description;
    }

    public Publisher() {
        
    }
    
    

    public String getPublishingYear() {
        return publishingYear;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
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
    

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public String toString() {
        return "Publisher{" + "publishingYear=" + publishingYear + ", email=" + email + ", description=" + description + '}';
    }
    
    
        
}
