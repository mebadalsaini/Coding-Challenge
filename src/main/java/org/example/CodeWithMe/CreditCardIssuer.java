package org.example.CodeWithMe;

import java.util.Scanner;

public class CreditCardIssuer {
    public static void main(String[] args) {
        System.out.print("Enter your limit between 400 to 850 : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if(a>=400 && a<=600){
            System.out.println("You'll receive a Silver Card.");
        }
        else if (a>=600 && a<=800){
            System.out.println("You'll receive a Gold Card.");
        }
        else if(a>=800 && a<=850){
            System.out.println("You'll receive a Platinum card.");
        }
        else {
            System.out.println("You have entered the wrong choice.");
        }
    }
}
