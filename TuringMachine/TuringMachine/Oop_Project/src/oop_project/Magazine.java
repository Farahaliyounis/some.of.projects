
package oop_project;

public class Magazine extends Book{
    
    public String Type;
    public String weekPublished;
    private double price;
    private int amount = 10;
    private Publisher publisher;

    public Magazine(String Type, String weekPublished, double price, Publisher publisher, String Title, String Author, int NumOfPages, int NumOfCopies) {
        super(Title, Author, NumOfPages, NumOfCopies);
        this.Type = Type;
        this.weekPublished = weekPublished;
        this.price = price;
        this.publisher = publisher; // Composition
    }

    public Magazine() {
        
    }
    
    

    public Publisher getPublisher() { //////////
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
    
    public String getType() {
        return Type;
    }

    public String getWeekPublished() {
        return weekPublished;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
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
    
    

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setWeekPublished(String weekPublished) {
        this.weekPublished = weekPublished;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Magazine{" + "Type=" + Type + ", weekPublished=" + weekPublished + ", price=" + price + ", amount=" + amount + '}';
    }
    
    
}
