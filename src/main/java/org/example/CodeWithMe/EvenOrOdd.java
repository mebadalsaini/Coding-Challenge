package org.example.CodeWithMe;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if(a%2 == 0){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }

    }
}
