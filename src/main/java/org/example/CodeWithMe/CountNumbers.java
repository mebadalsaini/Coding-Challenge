package org.example.CodeWithMe;

public class CountNumbers {
    public static void main(String[] args) {
        int a = 98750;
        int count = 0;
        while (a!=0){
            a = a/10;
            ++count;
        }
        System.out.println("Number of digits : "+count);
    }
}
