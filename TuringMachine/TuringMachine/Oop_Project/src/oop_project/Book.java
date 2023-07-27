package oop_project;

public class Book {

    protected String Title;
    protected String Author;
    protected int NumOfPages;
    protected int NumOfCopies;
    protected double price;

    public Book(String Title, String Author, int NumOfPages, int NumOfCopies) {
        this.Title = Title;
        this.Author = Author;
        this.NumOfPages = NumOfPages;
        this.NumOfCopies = NumOfCopies;
    }

    public Book() {
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

    public int numOfCopies(Book book, int copies) {
        int currentCopies = book.NumOfCopies;
        NumOfCopies -= copies;
        currentCopies = book.NumOfCopies;
        return currentCopies;
    }

    public void editTitle(String Title) {
        this.Title = Title;
        System.out.println("Edited Title Is " + Title);
    }

    public void editAuthor(String Author) {
        this.Author = Author;
        System.out.println("Edited Author Is " + Title);
    }

    public void editNumOfPages(int NumOfPages) {
        this.NumOfPages = NumOfPages;
        System.out.println("Edited Number Of Pages Is " + Title);
    }

    public void editnumOfCopies(int NumOfCopies) {
        this.NumOfCopies = NumOfCopies;
        System.out.println("Edited Numer Of Copies Is " + NumOfCopies);
    }

    @Override
    public String toString() {
        return "Title: " + this.Title + "\n"
                + "Author: " + this.Author + "\n"
                + "Number Of Pages: " + this.NumOfPages + "\n"
                + "Number Of Copies: " + this.NumOfCopies + "\n";
    }
}
