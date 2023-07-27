package oop_project;

import java.util.Scanner;

public class Oop_Project {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome " + "DR : Ahmed Moustafa");
            //-------------------------------------------------------//
            System.out.println("--------------------");

            System.out.println("");
            System.out.println("[1] ADD StudyBooks");
            System.out.println("[2] Delete StudyBooks");
            System.out.println("[3] View All StudyBooks");
            System.out.println("[4] ADD Magazine");
            System.out.println("[5] Delete Magazine");
            System.out.println("[6] View All Magazine");
            System.out.println("[7] ADD Secertary");
            System.out.println("[8] Delete Secertary ");
            System.out.println("[9] View All Secertary ");
            System.out.println("");
            System.out.println("Select Number: ");
            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    List.addstudyBooks();
                    break;

                case 2:
                    List.deletestudyBooks();
                    break;

                case 3:
                    List.printstudyBooks();
                    break;

                case 4:
                    List.addMagazine();
                    break;

                case 5:
                    List.deleteMagazine();
                    break;

                case 6:
                    List.printAllMagazine();
                    break;

                case 7:
                    List.addSecretary();
                    break;

                case 8:
                    List.deleteSecretary();
                    break;

                case 9:
                    List.printSecretary();
                    break;
                default:
                    break;
            }

        }
    }

}
