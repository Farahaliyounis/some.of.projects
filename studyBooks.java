package oop_project;

public class studyBooks extends Book {

    public String courseName;
    protected int num_Parts;
    protected int amount ;
    public double price;
    private Publisher publisher;

    public studyBooks(String courseName, int num_Parts, double price, String Title, String Author, int NumOfPages, int NumOfCopies) {
        super(Title, Author, NumOfPages, NumOfCopies);
        this.courseName = courseName;
        this.num_Parts = num_Parts;
        this.price = price;
    }

    public studyBooks() {
    }
    
    

    public studyBooks(String courseName, int num_Parts, double price, Publisher publisher, String Title, String Author, int NumOfPages, int NumOfCopies) {
        super(Title, Author, NumOfPages, NumOfCopies);
        this.courseName = courseName;
        this.num_Parts = num_Parts;
        this.price = price;
        this.publisher = publisher; //Agg
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNum_Parts() {
        return num_Parts;
    }

    public int getAmount() {
        return amount;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getNumOfPages() {
        return NumOfPages;
    }

    public int getNumOfCopies() {
        return NumOfCopies;
    }
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNum_Parts(int num_Parts) {
        this.num_Parts = num_Parts;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setNumOfPages(int NumOfPages) {
        this.NumOfPages = NumOfPages;
    }

    public void setNumOfCopies(int NumOfCopies) {
        this.NumOfCopies = NumOfCopies;
    }
    
    

    @Override
    public String toString() {
        return "studyBooks{" + "courseName=" + courseName + ", num_Parts=" + num_Parts + ", amount=" + amount + ", price=" + price + '}';
    }

}
