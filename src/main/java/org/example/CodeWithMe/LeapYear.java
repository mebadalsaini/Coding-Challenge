package org.example.CodeWithMe;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter no of days in the year : ");
        Scanner input = new Scanner(System.in);
        int noOfDays = input.nextInt();

        if(noOfDays<= 365){
            System.out.println("Not a leap year.");
        }
        else if (noOfDays== 366){
            System.out.println("Leap year");
        }
        else {
            System.out.println("You cannot have more than 366 days in an year.");
        }
    }
}
