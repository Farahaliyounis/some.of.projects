package oop_project;

public class Employee extends Person{
    
    protected int years;
    protected int ID;

    public Employee() {
    }
    
    
    public Employee(int years, String Name, int age, int phoneNumber, String Address) {
        super(Name, age, phoneNumber, Address);
        this.years = years;
    }
    
   
    public void setYears(int years) {
        this.years = years;
    }
    
    
    public int getHours() {
        return 40;           // works 40 hours / week
    }

    public double getSalary() {
        return 50000.0;      // $40,000.00 / year
    }

    public int getVacationDays() {
        return 10;           // 2 weeks' paid vacation
    }

    public int getYears() {
        return years;
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }

    public String toString() {
        return "";
    }

}
