package main;

import turingmachine.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         TuringMachine TM1 = MachinesLibrary.EqualBinaryWords();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter The String :");
        String input = sc.next();
      //  boolean done = TM1.runOfTm("010000110101#010000110101", false);
        //if (done == true) {
          //  System.out.println("The input was accepted.");
       // } else {
         //   System.out.println("The input was rejected.");
        //}
        boolean done = TM1.runOfTm(input, true);
        if (done == true)
        {
            System.out.println("The input was accepted.");
        }
        else 
        {
            System.out.println("The input was rejected.");       
        }
    }
}
