package com.niit.jdp;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ReverseDigit reverseDigit = new ReverseDigit();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int result = reverseDigit.getReverseDigit(number);
        System.out.println(result);
    }

    public int getReverseDigit(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
