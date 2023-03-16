package org.example.CodeWithMe;

public class SumOfDigits {
    public static void main(String[] args) {
        int a = 12345;
        int temp, sum = 0;
        while(a>0){
            temp = a%10;
            sum = sum + temp;
            a = a/10;
        }
        System.out.println(sum);
    }
}
