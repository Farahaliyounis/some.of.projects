
package oop_project;

public class Student extends Person {

    protected int ID;
    private String Department;
    private String Level;
    private int rentedBooks;  

    public Student(int ID, String Department, String Level, int rentedBooks, String Name, int age, int phoneNumber, String Address) {
        super(Name, age, phoneNumber, Address);
        this.ID = ID;
        this.Department = Department;
        this.Level = Level;
        this.rentedBooks = rentedBooks;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public void setRentedBooks(int rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
    public int getID() {
        return ID;
    }

    public String getDepartment() {
        return Department;
    }

    public String getLevel() {
        return Level;
    }

    public int getRentedBooks() {
        return rentedBooks;
    }
    
    public int rentedBooks(Book book, int copies) { //Asso
        book.numOfCopies(book, copies);
        rentedBooks += copies;
        return rentedBooks;
    }

    @Override
    public String toString() {
        
        return "Student{" + "ID=" + ID + ", Department=" + Department + ", Level=" + Level + ", rentedBooks=" + rentedBooks + '}';
    }
    

   
    
}
