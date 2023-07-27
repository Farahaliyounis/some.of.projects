package oop_project;

import java.util.*;

public class List {

    static ArrayList<Magazine> magazineList = new ArrayList<>();
    static ArrayList<Librarian> librarianList = new ArrayList<>();
    static ArrayList<Secretary> SecretaryList = new ArrayList<>();
    static ArrayList<studyBooks> studyBooksList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    // Magazine
    public static void addMagazine() {
        Magazine m1 = new Magazine();
        System.out.println("Title : ");
        m1.setTitle(sc.next());

        System.out.println("Author : ");
        m1.setAuthor(sc.next());

        System.out.println("NumOfPages : ");
        m1.setNumOfPages(sc.nextInt());

        System.out.println(" NumOfCopies : ");
        m1.setNumOfCopies(sc.nextInt());

        System.out.println(" Type : ");
        m1.setType(sc.next());

        System.out.println("Date Published: ");
        m1.setWeekPublished(sc.next());

        System.out.println(" price : ");
        m1.setPrice(sc.nextInt());

        System.out.println("Publisher: >> Enter The Information Of Publisher : ");

        Publisher p = new Publisher();

        System.out.println(" Name: ");
        p.setName(sc.next());

        System.out.println("Age");
        p.setAge(sc.nextInt());

        System.out.println(" Address: ");
        p.setAddress(sc.next());

        System.out.println(" Phone Number: ");
        p.setPhoneNumber(sc.nextInt());

        System.out.println(" publishingYear: ");
        p.setPublishingYear(sc.next());

        System.out.println(" email: ");
        p.setEmail(sc.next());

        System.out.println(" description: ");
        p.setDescription(sc.next());

        m1.setPublisher(p);

        magazineList.add(m1);

    }

    public static void deleteMagazine() {

        System.out.println("Enter the Title Of The Magazine : ");
        String title = sc.next();

        for (Magazine m : magazineList) {
            if (title.equalsIgnoreCase(m.getTitle())) {
                System.out.println("the details of the Magazine are:" + m.toString());
            } else {
                System.out.println("There Is No Magazine ");
            }
        }

    }

    public static void printAllMagazine() {
        System.out.println(magazineList);
    }

    // Librarian
    public static void addlibrarian() {
        Librarian l = new Librarian();

        System.out.println(" Name: ");
        l.setName(sc.next());

        System.out.println("Age");
        l.setAge(sc.nextInt());

        System.out.println(" Address: ");
        l.setAddress(sc.next());

        System.out.println(" Phone Number: ");
        l.setPhoneNumber(sc.nextInt());

        System.out.println("Years: ");
        l.setYears(sc.nextInt());

        System.out.println("ID: ");
        l.setID(sc.nextInt());

        librarianList.add(l);

    }

    public static void deletelibrarian() {
        System.out.println("Enter the ID Of The Librarian : ");
        int id = sc.nextInt();

        for (Librarian l : librarianList) {
            if (id == l.getID()) {
                System.out.println("Done");
            } else {
                System.out.println("There Is No LIbrarian ");
            }
        }

    }

    public static void printAllibrarian() {
        System.out.println(librarianList);

    }

    public static void addSecretary() {
        Secretary s = new Secretary();

        System.out.println(" Name: ");
        s.setName(sc.next());

        System.out.println("Age");
        s.setAge(sc.nextInt());

        System.out.println(" Address: ");
        s.setAddress(sc.next());

        System.out.println(" Phone Number: ");
        s.setPhoneNumber(sc.nextInt());

        System.out.println("Years: ");
        s.setYears(sc.nextInt());

        System.out.println("ID :");
        s.setID(sc.nextInt());

        SecretaryList.add(s);

    }

    public static void deleteSecretary() {
        System.out.println("Enter the ID Of The Secretary : ");
        int id = sc.nextInt();

        for (Secretary s : SecretaryList) {
            if (id == s.getID()) {
                System.out.println("Done");
            } else {
                System.out.println("There Is No Secretary ");
            }
        }

    }

    public static void printSecretary() {
        System.out.println(SecretaryList);
    }

    public static void addstudyBooks() {
        studyBooks b = new studyBooks();
        System.out.println("Title : ");
        b.setTitle(sc.next());

        System.out.println("Author : ");
        b.setAuthor(sc.next());

        System.out.println("NumOfPages : ");
        b.setNumOfPages(sc.nextInt());

        System.out.println(" NumOfCopies : ");
        b.setNumOfCopies(sc.nextInt());

        System.out.println(" CourseName : ");
        b.setCourseName(sc.next());

        System.out.println("Amount: ");
        b.setAmount(sc.nextInt());

        System.out.println("price : ");
        b.setPrice(sc.nextInt());

        System.out.println("Publisher: >> Enter The Information Of Publisher : ");

        Publisher p = new Publisher();

        System.out.println(" Name: ");
        p.setName(sc.next());

        System.out.println("Age");
        p.setAge(sc.nextInt());

        System.out.println(" Address: ");
        p.setAddress(sc.next());

        System.out.println(" Phone Number: ");
        p.setPhoneNumber(sc.nextInt());

        System.out.println(" publishingYear: ");
        p.setPublishingYear(sc.next());

        System.out.println(" email: ");
        p.setEmail(sc.next());

        System.out.println(" description: ");
        p.setDescription(sc.next());

        b.setPublisher(p);

        studyBooksList.add(b);
    }

    public static void deletestudyBooks() {
        System.out.println("Enter the Title Of The Book : ");
        String title = sc.next();

        for (studyBooks b : studyBooksList) {
            if (title.equalsIgnoreCase(b.getTitle())) {
                System.out.println("the details of the Book are:" + b.toString());
            } else {
                System.out.println("There Is No Book ");
            }
        }
    }

    public static void printstudyBooks() {
        System.out.println(studyBooksList);
    }

}
